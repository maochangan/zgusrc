package net.zgysrc.www.controller;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.zgysrc.www.bean.CollectionPost;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.service.CompanyUserService;
import net.zgysrc.www.service.MobileCodeService;
import net.zgysrc.www.service.PostReleaseService;
import net.zgysrc.www.utils.Configuration;
import net.zgysrc.www.utils.GetMobileCode;
import net.zgysrc.www.utils.MailUtil;
import net.zgysrc.www.utils.Msg;
import net.zgysrc.www.utils.UtilsMD5;
import net.zgysrc.www.utils.MobileUtils.IndustrySMS;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "companyUserController")
@Controller
public class CompanyUserController {

	@Autowired
	private CompanyUserService companyUserService;
	@Autowired
	private MobileCodeService mobileCodeService;
	@Autowired
	private PostReleaseService postReleaseService;

	/**
	 * 用户名检查
	 * 
	 * @param cUserName
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/checkRegister", method = RequestMethod.GET)
	public Msg checkRegister(String cUserName) {
		boolean check = companyUserService.checkRegister(cUserName);
		if (check) {
			String msg = "用户名可用";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "用户名不可用";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 邮箱验证
	 * 
	 * @param companyUser
	 * @return
	 * @throws Exception
	 * @throws NoSuchAlgorithmException
	 * @throws MessagingException
	 */
	@SuppressWarnings("unused")
	@ResponseBody
	@RequestMapping(value = "/registerCheckMail", method = RequestMethod.GET)
	public Msg registerCheckMail(CompanyUser companyUser)
			throws Exception, NoSuchAlgorithmException, MessagingException {
		boolean state = companyUserService.checkEmail(companyUser.getcEmail());
		if (state) {
			CompanyUser cUser = MailUtil.activateMail(companyUser);
			// todo
			// register(cUser);
			String msg = "验证成功";
			// todu
			return Msg.success().add("msg", msg);
		} else {
			String msg = "验证失败！请重试";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 邮箱激活验证
	 * 
	 * @param token
	 * @param email
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/activatEmail")
	public Msg activatEmail(String token, String email) throws Exception {
		Long time = System.currentTimeMillis();
		CompanyUser u = companyUserService.loadByEmail(email);
		if (u != null) {
			if (u.getEmailAc() == "0" && u.getEmainAcTime() != 1) {
				if (u.getEmainAcTime() < time) {
					u.setEmainAcTime(Long.parseLong("-1"));
					u = MailUtil.activateMail(u);
					companyUserService.updateById(u);
					String msg = "信息超时，已重新发送";
					return Msg.fail().add("msg", msg);
				} else if (u.getEmainAcTime() > time) {
					u.setEmainAcTime(Long.parseLong("1"));
					if (u.getToken().equals(token)) {
						u.setEmailAc("1");
						u.setCreateDate(new Date());
						u.setToken(token.replace("1", "c"));
						companyUserService.updateById(u);
						String msg = "验证成功";
						return Msg.success().add("msg", msg);
					} else {
						String msg = "状态异常，请重试";
						return Msg.fail().add("msg", msg);
					}
				}
			} else if (u.getEmailAc() == "1") {
				String msg = "状态异常，请重试";
				return Msg.fail().add("msg", msg);
			}
		} else if (u == null) {
			String msg = "状态异常，请重试";
			return Msg.fail().add("msg", msg);
		}
		u.setcPassword(UtilsMD5.md5(u.getcPassword()));
		return Msg.success().add("u", u);
	}

	// /**
	// * 邮箱验证按钮
	// *
	// */
	// @ResponseBody
	// @RequestMapping(value = "/checkEmail", method = RequestMethod.GET)
	// public Msg chec

	/**
	 * 注册
	 * 
	 * @param model
	 * @param companyUser
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Msg register(CompanyUser companyUser, HttpSession session) throws Exception {
		companyUser.setcPassword(UtilsMD5.md5(companyUser.getcPassword()));
		boolean state = companyUserService.register(companyUser);
		if (state) {
			String msg = "注册成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "注册失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 登录
	 * 
	 * @param code
	 * @param model
	 * @param companyUser
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Msg login(CompanyUser companyUser, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws Exception {
		companyUser.setcPassword(UtilsMD5.md5(companyUser.getcPassword()));
		CompanyUser cUser = companyUserService.checkLogin(companyUser);
		if (cUser == null) {
			String msg = "用户名密码错误!";
			return Msg.fail().add("msg", msg);
		} else {
			cUser.setcPassword(null);
			session.setAttribute("user", cUser);
			return Msg.success().add("user", cUser);
		}
	}

	/**
	 * 获得session
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/returnSession", method = RequestMethod.POST)
	@ResponseBody
	public Msg returnSession(HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "未登入状态！";
			return Msg.fail().add("msg", msg);
		} else {
			user.setcPassword(null);
			return Msg.success().add("user", user);
		}

	}

	/**
	 * 忘记密码
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/modifyCompanyUser", method = RequestMethod.POST)
	public Msg modifyCompanyUser(String cUserName , String psd, String cTelephoneNumber) throws Exception{
		CompanyUser companyUser = companyUserService.getCompanyUserByTelephoneNum(cTelephoneNumber);
		if(companyUser == null){
			return Msg.fail().add("msg", "用户不存在！");
		}else{
			companyUser.setcPassword(UtilsMD5.md5(psd));
			boolean state = companyUserService.updateCompanyUserSelective(companyUser);
			if(state){
				return Msg.success().add("msg", "修改成功！");
			}else{
				return Msg.fail().add("msg", "修改失败！");
			}
		}
	}
	
	/**
	 * 验证验证码
	 */
	@ResponseBody
	@RequestMapping(value = "/checkUserName", method = RequestMethod.GET)
	public Msg checkUserName(String cUserName , String cTelephoneNumber) {
		boolean check = companyUserService.checkUserName(cUserName , cTelephoneNumber);
		if (check) {
			String msg = "用户名正确！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "用户名不正确！";
			return Msg.fail().add("msg", msg);
		}
	}
	
	
	
	/**
	 * 退出登录
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/userLogout", method = RequestMethod.POST)
	@ResponseBody
	public Msg userLogout(HttpSession session) {
		session.removeAttribute("user");
		String msg = "退出成功！";
		return Msg.success().add("msg", msg);
	}

	/**
	 * 信息修改
	 * 
	 * @param model
	 * @param companyUser
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/revise", method = RequestMethod.GET)
	public Msg revise(CompanyUser companyUser, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		CompanyUser companyUser2 = (CompanyUser) session.getAttribute("user");
		if (companyUser2 == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			companyUser.setId(companyUser2.getId());
			CompanyUser cUser = companyUserService.updateById(companyUser);
			if (cUser == null) {
				String msg = "修改失败";
				return Msg.fail().add("msg", msg);
			} else {
				cUser.setcPassword(null);
				return Msg.success().add("companyUser", cUser);
			}
		}
	}

	private int codeCount = 4;

	/**
	 * 登入验证码
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/loginCheck", method = RequestMethod.GET)
	public Msg loginCheck(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Random random = new Random();
		StringBuffer randomCode = new StringBuffer();
		char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 0; i < codeCount; i++) {
			String code = String.valueOf(codeSequence[random.nextInt(codeSequence.length - 1)]);
			randomCode.append(code);
		}
		session.setAttribute("code", randomCode);
		return Msg.success().add("code", randomCode);
	}

	/**
	 * 个人信息
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/userInfo", method = RequestMethod.GET)
	public Msg userInfo(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		return Msg.success().add("companyUser", companyUser);
	}

	/**
	 * 手机验证码
	 * 
	 * @param cTelephoneNumber
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/mobileCheck", method = RequestMethod.GET)
	public Msg mobileCheck(String cTelephoneNumber, HttpSession session) {
		StringBuffer code = GetMobileCode.getCode();
		mobileCodeService.insertInto(cTelephoneNumber, code);
		IndustrySMS.execute(cTelephoneNumber, code.toString());
		String msg = "验证码已发送！";
		return Msg.success().add("msg", msg);
	}

	/**
	 * 获取手机验证码
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getMobileCode", method = RequestMethod.GET)
	public Msg getMobileCode(String cTelephoneNumber) {
		String code = mobileCodeService.findMobile(cTelephoneNumber);
		if(code == null){
			String msg = "验证码无效！";
			return Msg.fail().add("msg", msg);
		}else{
			return Msg.success().add("code", code);
		}
	}

	/**
	 * 手机验证码登录
	 * 
	 * @param cTelephoneNumber
	 * @param session
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/loginByMobileCheck", method = RequestMethod.GET)
	public Msg loginByMobileCheck(String cTelephoneNumber, String code, HttpSession session) throws Exception {
		boolean state = companyUserService.checkMobileNum(cTelephoneNumber);
		if (state) {
			String msg = "手机号有误，请重新输入！";
			return Msg.fail().add("msg", msg);
		} else {
			String theCode = mobileCodeService.findMobile(cTelephoneNumber);
			if (theCode.equals(code)) {
				CompanyUser companyUser = companyUserService.loginByMobileCheck(cTelephoneNumber);
				companyUser.setcPassword(UtilsMD5.md5(companyUser.getcPassword()));
				session.setAttribute("user", companyUser);
				return Msg.success().add("user", companyUser);
			} else {
				String msg = "验证码错误，请重新输入！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 验证手机号
	 */
	@ResponseBody
	@RequestMapping(value = "/checkMobileNum", method = RequestMethod.GET)
	public Msg checkMobileNum(String cTelephoneNumber) {
		boolean state = companyUserService.checkMobileNum(cTelephoneNumber);
		if (state) {
			String msg = "手机号正确！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "手机号已存在！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 修改个人信息
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/modifyCompanyUserInfo", method = RequestMethod.POST)
	public Msg modifyCompanyUserInfo(CompanyUser companyUser, MultipartFile files, HttpServletRequest request,
			HttpSession session) throws Exception {
		CompanyUser u = (CompanyUser) session.getAttribute("user");
		if (u == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			if (files == null) {
				companyUser.setId(u.getId());
				CompanyUser user = companyUserService.modifyCompanyUserInfo(companyUser);
				if (user == null) {
					String msg = "修改失败！";
					return Msg.fail().add("msg", msg);
				} else {
					session.removeAttribute("user");
					session.setAttribute("user", user);
					user.setcPassword(UtilsMD5.md5(user.getcPassword()));
					return Msg.success().add("user", user);
				}
			} else {
				String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/logo/"
						+ u.getcUserName() + "/" + files.getOriginalFilename();
				File dir = new File(path);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				files.transferTo(dir);
				String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
						+ request.getServletContext().getContextPath() + "/files/pic/logo/" + u.getcUserName() + "/"
						+ files.getOriginalFilename();
				companyUser.setcImage(dataPath);
				companyUser.setId(u.getId());
				CompanyUser user = companyUserService.modifyCompanyUserInfo(companyUser);
				if (user == null) {
					String msg = "修改失败！";
					return Msg.fail().add("msg", msg);
				} else {
					session.removeAttribute("user");
					session.setAttribute("user", user);
					user.setcPassword(UtilsMD5.md5(user.getcPassword()));
					return Msg.success().add("user", user);
				}
			}
		}
	}

	/**
	 * 提交企业认证
	 * 
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/submitCompanyAuthenticate", method = RequestMethod.GET)
	public Msg submitCompanyAuthenticate(HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			boolean state = companyUserService.submitCompanyAuthenticate(user.getcName());
			if (state) {
				String msg = "提交申请认证成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "提交失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 获取审核情况
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyAcState", method = RequestMethod.GET)
	public Msg getCompanyAcState(HttpSession session){
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if(companyUser == null){
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		if(!companyInfo.getcAc().equals("审核通过")){
			String msg = "审核未通过或未完成！";
			return Msg.fail().add("msg", msg);
		}else{
			String msg = "审核通过！";
			return Msg.success().add("msg", msg);
		}
		
	}
	
	/**
	 * 职位发布
	 * 
	 * @param session
	 * @param postRelease
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/postReleaseByCompanyUser", method = RequestMethod.GET)
	public Msg postReleaseByCompanyUser(HttpSession session, PostRelease postRelease) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(user.getcName());
		if(!companyInfo.getcAc().equals("审核通过")){
			String msg = "审核未通过或未完成！";
			return Msg.fail().add("msg", msg);
		}
		postRelease.setcCompanyLogo(companyInfo.getcCompanyLogo());
		postRelease.setcCompanyName(companyInfo.getcCompanyName());
		postRelease.setClicks(0);
		postRelease.setcId(companyInfo.getId());
		postRelease.setCompanyTypeOne(companyInfo.getcCompanyTypeOne());
		postRelease.setcUserName(user.getcUserName());
		postRelease.setCompanyTypeOne(companyInfo.getcCompanyTypeOne());
		postRelease.setpWelfare(companyInfo.getcSitting());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(date);
		postRelease.setpStartTime(time);
		postRelease.setpWelfare(companyInfo.getcSitting());
		postRelease.setpWelfare("");
		boolean state = postReleaseService.postReleaseAdd(postRelease);
		if (state) {
			String msg = "发布成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "发布失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 查看职位详情
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getPostRelease", method = RequestMethod.GET)
	public Msg getPostRelease(Integer id, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		PostRelease postRelease = companyUserService.getPostReleaseInfo(id);
		if (postRelease == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("postInfo", postRelease);
		}
	}

	/**
	 * 发布中职位修改
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/updatePostRelease", method = RequestMethod.GET)
	public Msg updatePostRelease(PostRelease postRelease, HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}

		boolean state = postReleaseService.postReleaseUpdate(postRelease);
		if (state) {
			String msg = "修改成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "修改失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 检查公司是否存在
	 */
	@ResponseBody
	@RequestMapping(value = "/checkCompanyName", method = RequestMethod.GET)
	public Msg checkCompanyName(String cCompanyName){
		boolean state = companyUserService.checkCompanyName(cCompanyName);
		if(state){
			String msg = "公司名可用！";
			return Msg.success().add("msg", msg);
		}else{
			String msg = "公司已存在！";
			return Msg.fail().add("msg", msg);
		}
		
		
	}
	
	
	/**
	 * 上传营业执照注册时
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/uploadLicenseByEegist", method = RequestMethod.POST)
	public Msg uploadLicenseByEegist(MultipartFile files, HttpServletRequest request, String cCompanyName,
			String address) throws IllegalStateException, Exception {
		boolean state = companyUserService.checkCompanyName(cCompanyName);
		if (state) {
			CompanyInfo companyInfo = new CompanyInfo();
			companyInfo.setcCompanyName(cCompanyName);
			companyInfo.setcCompanyAddress(address);
			companyInfo.setClicks(0);
			companyInfo.setCollNum(0);
			companyInfo.setcCompanyInfo("");
			companyInfo.setcSitting("");
			companyInfo.setcCompanyPic("");
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String formatDate = sdf.format(date);
			companyInfo.setRegisteTime(formatDate);
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/license/"
					+ companyInfo.getcCompanyName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/license/"
					+ companyInfo.getcCompanyName() + "/" + files.getOriginalFilename();
			companyInfo.setBusinessLicense(dataPath);
			companyInfo.setcAc("正在审核");
			companyUserService.addCompany(companyInfo);
			String msg = "公司注册成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "公司已存在";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 上传营业执照
	 * 
	 * @param files
	 * @param filesLicense
	 * @param pic
	 * @param request
	 * @param session
	 * @return
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/uploadLicense", method = RequestMethod.POST)
	public Msg addCompany(MultipartFile files, HttpServletRequest request, String cCompanyName, HttpSession session)
			throws IllegalStateException, Exception {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录!";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		if (companyInfo == null) {
			String msg = "无信息";
			return Msg.fail().add("msg", msg);
		} else {
			if (companyInfo.getcCompanyName() != null && companyInfo.getcUserName() != null
					&& files.getOriginalFilename() != null) {
				String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/license/"
						+ companyInfo.getcCompanyName() + "/" + files.getOriginalFilename();
				File dir = new File(path);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				files.transferTo(dir);
				String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
						+ request.getServletContext().getContextPath() + "/files/pic/license/"
						+ companyInfo.getcCompanyName() + "/" + files.getOriginalFilename();
				companyInfo.setBusinessLicense(dataPath);
				boolean state = companyUserService.uploadLicense(companyInfo);
				if (state) {
					String msg = "上传成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "失败！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				String msg = "无公司信息！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompamyInfo", method = RequestMethod.GET)
	public Msg getCompamyInfo(HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		if (companyInfo == null) {
			String msg = "无公司信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("companyInfo", companyInfo);
		}
	}

	/**
	 * 企业信息修改
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/updateCompamyInfo", method = RequestMethod.POST)
	public Msg updateCompamyInfo(HttpSession session, CompanyInfo companyInfo, HttpServletRequest request)
			throws IllegalStateException, Exception {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyInfo == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfos = companyUserService.getCompany(companyUser.getcName());
		companyInfo.setId(companyInfos.getId());
		boolean state = companyUserService.uploadLicense(companyInfo);
		if (state) {
			String msg = "修改成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 企业信息修改 logo
	 * 
	 * @param companyInfo
	 * @param files
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/updateCompanyInfoLogo", method = RequestMethod.POST)
	public Msg addCompany(MultipartFile files, String cCompanyInfo, List<MultipartFile> pic, HttpServletRequest request,
			HttpSession session) throws IllegalStateException, Exception {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/logo/"
				+ companyInfo.getcCompanyName() + "/" + files.getOriginalFilename();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		files.transferTo(dir);
		String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
				+ request.getServletContext().getContextPath() + "/files/pic/logo/" + companyInfo.getcCompanyName()
				+ "/" + files.getOriginalFilename();
		companyInfo.setcCompanyLogo(dataPath);
		companyInfo.setcCompanyInfo(cCompanyInfo);
		if (pic != null && pic.size() > 0) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < pic.size(); i++) {
				MultipartFile file = pic.get(i);
				String paths = request.getSession().getServletContext().getRealPath("/") + "files/pic/pics/"
						+ companyInfo.getcCompanyName() + "/" + file.getOriginalFilename();
				File dirs = new File(paths);
				if (!dirs.exists()) {
					dirs.mkdirs();
				}
				files.transferTo(dirs);
				String dataPaths = "http://" + Configuration.IP + ":" + request.getLocalPort()
						+ request.getServletContext().getContextPath() + "/files/pic/pics/"
						+ companyInfo.getcCompanyName() + "/" + file.getOriginalFilename();
				sb.append(dataPaths);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length() - 1);
			companyInfo.setcCompanyPic(sb.toString());
			boolean state = companyUserService.uploadLicense(companyInfo);
			if (state) {
				String msg = "修改成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			boolean state = companyUserService.uploadLicense(companyInfo);
			if (state) {
				String msg = "修改成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "失败！";
				return Msg.fail().add("msg", msg);
			}
		}

	}

	/**
	 * 查看职位数
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "getPostRestNum", method = RequestMethod.GET)
	public Msg getPostRestNum(HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		List<Map<String, Object>> list = companyUserService.getPosetRestSize(companyInfo.getId());
		List<GetResume> list2 = companyUserService.getGetResumeNum(companyUser.getcUserName());
		List<CollectionPost> list3 = companyUserService.getCollectPostNum(companyInfo.getId());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyName", companyInfo.getcCompanyName());
		map.put("RegisteTime", companyInfo.getRegisteTime());
		map.put("address", companyInfo.getcCompanyAddress());
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer postRestNum = list.size();
			Integer getResumeNum = list2.size();
			Integer getCollectionNum = list3.size();
			return Msg.success().add("postRestNum", postRestNum).add("getResumeNum", getResumeNum)
					.add("collectionNum", getCollectionNum).add("companyInfo", map);
		}
	}

	
	
	
	
	/**
	 * 查看企业职位
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "getPostRestSize", method = RequestMethod.GET)
	public Msg getPsotRestSzie(Integer pn, Integer size, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(companyUser.getcName());
		PageHelper.startPage(pn, size);
		List<Map<String, Object>> list = companyUserService.getPosetRestSize(companyInfo.getId());
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 获取被投递职位信息
	 * 
	 * @param session
	 * @param postRelease
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllPostRelease", method = RequestMethod.GET)
	public Msg getAllPostRelease(Integer pn, HttpSession session, PostRelease postRelease) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		CompanyInfo companyInfo = companyUserService.getCompany(user.getcName());
		PageHelper.startPage(pn, 10);
		List<Map<String, Object>> list = companyUserService.getPosetRestSize(companyInfo.getId());
		List<GetResume> list2 = postReleaseService.getResumeByPostUserIds(user.getId());
		if (list == null) {
			String msg = "暂无发布信息！";
			return Msg.fail().add("msg", msg);
		} else {
			if (list2 == null) {
				for(int i = 0 ; i < list.size() ; i ++){
					list.get(i).put("getResumeSize", 0);
				}
				PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(list);
				return Msg.success().add("pageInfo", pageInfo);
			} else {
				for (int i = 0; i < list.size(); i++) {
					int size = 0;
					for (int j = 0; j < list2.size(); j++) {
						if (list.get(i).get("id").equals(list2.get(j).getPostId())) {
							size++;
						}
						list.get(i).put("getResumeSize", size);
					}
				}
				PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(list);
				return Msg.success().add("pageInfo", pageInfo);
			}
		}
	}

	/**
	 * 获取职位被投递信息
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getPostReleaseInfo", method = RequestMethod.GET)
	public Msg getPostReleaseInfo(Integer id, HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		PostRelease post = postReleaseService.findPostById(id);
		if (post == null) {
			String msg = "无发布信息";
			return Msg.fail().add("msg", msg);
		} else {
			List<GetResume> list = postReleaseService.getResumeByPostUserId(id);
			List<Map<String, Object>> lsits = companyUserService.getresumes(list);
			if (list == null) {
				String msg = "暂无人才投递！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("postInfo", post).add("list", lsits);
			}
		}
	}

	/**
	 * 全部简历信息
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllResume", method = RequestMethod.GET)
	public Msg getAllResume(Integer pn, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		List<GetResume> list = postReleaseService.getResumeByPostUserIds(companyUser.getId());
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageHelper.startPage(pn, 5);
			List<Resume> lists = companyUserService.getAllResume(list);
			PageInfo<Resume> pageInfo = new PageInfo<Resume>(lists);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 删除简历
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteGetResume", method = RequestMethod.GET)
	public Msg deleteGetResume(Integer gid, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		boolean state = companyUserService.deleteGetResume(gid);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}
	
	/**
	 * 根据简历id查看求职者简历信息
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getResumeById", method = RequestMethod.GET)
	public Msg getResumeById(Integer id, HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		if (user == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
//		GetResume getResume = companyUserService.getGetResume(id,);
		//TODO
		Resume resume = companyUserService.getResumeById(id);
		if (resume == null) {
			String msg = "无简历信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("resume", resume);
		}
	}

	/**
	 * 职位删除
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/dropPostById", method = RequestMethod.GET)
	public Msg dropPostById(Integer id, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		boolean state = companyUserService.dropPostById(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

}
