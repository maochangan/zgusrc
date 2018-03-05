package net.zgysrc.www.controller.simcontroller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

import net.zgysrc.www.bean.Article;
import net.zgysrc.www.bean.ArticleList;
import net.zgysrc.www.bean.AualificationCertification;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.ImageInfo;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.bean.bean.CPost;
import net.zgysrc.www.service.AdminService;
import net.zgysrc.www.service.MobileCodeService;
import net.zgysrc.www.service.PostReleaseService;
import net.zgysrc.www.service.simservice.SimpleUserService;
import net.zgysrc.www.utils.Configuration;
import net.zgysrc.www.utils.GetMobileCode;
import net.zgysrc.www.utils.Msg;
import net.zgysrc.www.utils.UtilStringBufferToString;
import net.zgysrc.www.utils.UtilsMD5;
import net.zgysrc.www.utils.MobileUtils.IndustrySMS;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "simpleUserController")
@Controller
public class SimpleUserController {

	@Autowired
	private SimpleUserService simpleUserService;

	@Autowired
	private MobileCodeService mobileCodeService;

	@Autowired
	private PostReleaseService postReleaseService;

	@Autowired
	private AdminService adminService;

	/**
	 * 验证手机号是否存在
	 * 
	 * @param mobile
	 * @return
	 */

	@RequestMapping(value = "/checkMobile", method = RequestMethod.GET)
	@ResponseBody
	public Msg checkMobile(String mobile) {
		if (null == mobile) {
			String msg = "未获取手机号";
			return Msg.fail().add("msg", msg);
		} else {
			boolean state = simpleUserService.checkMobile(mobile);
			if (state) {
				String msg = "手机号可用！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "手机号已存在！";
				return Msg.fail().add("msg", msg);
			}

		}

	}

	/**
	 * 用户手机注册
	 * 
	 * @param mobile
	 *            手机号
	 * @param code
	 *            验证码
	 * @param simplePassword
	 *            密码
	 * @param simpleUser
	 *            用户名
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/reviseByMobile", method = RequestMethod.GET)
	@ResponseBody
	public Msg revise(String mobile, String code, String simplePassword, SimpleUser simpleUser, HttpSession session)
			throws Exception {
		if (mobile == null && code == null) {
			String msg = "手机与验证码不能为空！";
			return Msg.fail().add("msg", msg);
		} else {
			boolean state = simpleUserService.checkMobile(mobile);
			String theCode = mobileCodeService.findMobile(mobile);
			if (state && code.equals(theCode)) {
				simpleUser.setSimpleName(mobile);
				simpleUser.setMobile(mobile);
				simpleUser.setSimplePassword(UtilsMD5.md5(simplePassword));
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				String dates = sdf.format(date);
				simpleUser.setRegisterTime(dates);
				boolean info = simpleUserService.reviseByMobile(simpleUser);
				Resume resume = new Resume();
				resume.setRealName(mobile);
				resume.setMobile(mobile);
				resume.setEmail(simpleUser.getSimpleEmail());
				simpleUserService.setResume(resume);
				SimpleUser user = simpleUserService.getUser(simpleUser);
				if (info && user != null) {
					String msg = "注册成功！";
					session.setAttribute("simpleUser", user);
					return Msg.success().add("msg", msg).add("user", simpleUser);
				} else {
					String msg = "验证码错误！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				String msg = "验证码有误 或手机号已存在！";
				return Msg.fail().add("msg", msg);
			}

		}

	}

	/**
	 * 发送验证码
	 * 
	 * @param mobile
	 *            手机号
	 * @return
	 */
	@RequestMapping(value = "/sendMobileCode", method = RequestMethod.GET)
	@ResponseBody
	public Msg sendMobileCode(String mobile) {
		StringBuffer code = GetMobileCode.getCode();

		mobileCodeService.insertInto(mobile, code);

		IndustrySMS.execute(mobile, code.toString());

		String msg = "验证码已发送！";

		return Msg.success().add("msg", msg);
	}

	/**
	 * 验证码登录
	 * 
	 * @param mobile
	 *            手机号
	 * @param code
	 *            验证码
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/loginByMobileCode", method = RequestMethod.POST)
	@ResponseBody
	public Msg loginByMobileCode(String mobile, String code, HttpSession session) throws Exception {
		if (mobile != null && code != null) {
			boolean state = simpleUserService.checkMobile(mobile);
			String theCode = mobileCodeService.findMobile(mobile);
			SimpleUser simpleUser = simpleUserService.loginByMobileCode(mobile);
			if (code.equals(theCode) && !state && simpleUser != null) {
				simpleUser.setSimplePassword(UtilsMD5.md5(simpleUser.getSimplePassword()));
				session.setAttribute("simpleUser", simpleUser);
				String msg = "成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "验证码无效！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "手机号与验证码不能为空！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 检查用户名
	 * 
	 * @param simpleName
	 *            用户名
	 * @return
	 */
	@RequestMapping(value = "/checkUserName", method = RequestMethod.GET)
	@ResponseBody
	public Msg checkUserName(String simpleName) {
		boolean state = simpleUserService.checkUserName(simpleName);
		if (state) {
			String msg = "用户名可用！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "用户名已存在！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 手机号与密码登录
	 * 
	 * @param mobile
	 *            手机号
	 * @param sPassword
	 *            密码
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/loginByMobile", method = RequestMethod.POST)
	@ResponseBody
	public Msg loginByMobile(String mobile, String sPassword, HttpSession session) throws Exception {
		if (mobile == null && sPassword == null) {
			String msg = "用户名密码不能为空！";
			return Msg.fail().add("msg", msg);
		} else {
			SimpleUser simpleUser = simpleUserService.loginByMobile(mobile, sPassword);
			if (simpleUser != null) {
				simpleUser.setSimplePassword(UtilsMD5.md5(simpleUser.getSimplePassword()));
				session.setAttribute("simpleUser", simpleUser);
				String msg = "登入成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "状态异常，请重试！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 用户名密码登录
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/loginByUserName", method = RequestMethod.POST)
	@ResponseBody
	public Msg loginByUserName(SimpleUser simpleUsers, HttpSession session) throws Exception {
		if (simpleUsers.getSimpleName() == null && simpleUsers.getSimplePassword() == null) {
			String msg = "用户名密码不能为空！";
			return Msg.fail().add("msg", msg);
		} else {
			SimpleUser simpleUser = simpleUserService.loginByUserName(simpleUsers);
			if (simpleUser != null) {
				// 密码md5加密
				simpleUser.setSimplePassword(UtilsMD5.md5(simpleUser.getSimplePassword()));
				session.setAttribute("simpleUser", simpleUser);
				return Msg.success().add("simpleUser", simpleUser);
			} else {
				String msg = "状态异常，请重试！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 获取个人信息
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg getUserInfo(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {
		SimpleUser user = (SimpleUser) session.getAttribute("simpleUser");
		user.setSimplePassword(UtilsMD5.md5(user.getSimplePassword()));
		return Msg.success().add("userInfo", user);
	}

	/**
	 * 密码修改
	 * 
	 * @param session
	 * @param simpleUser
	 *            新密码 ：private String simplePassword;
	 * @param password
	 *            原密码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
	@ResponseBody
	public Msg modifyPassword(HttpSession session, SimpleUser simpleUser, String password) throws Exception {
		SimpleUser u = (SimpleUser) session.getAttribute("simpleUser");
		if (u == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			u.setSimplePassword(password);
			boolean state = simpleUserService.checkPassword(u);
			if (state) {
				simpleUser.setId(u.getId());
				boolean info = simpleUserService.updateSimpleUserInfo(simpleUser);
				if (info) {
					String msg = "修改成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "修改失败！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				String msg = "原密码错误！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 忘记密码
	 * 
	 * @throws Exception
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/modifyPasswordByMobile", method = RequestMethod.POST)
	public Msg modifyPasswordByMobile(String psd, HttpSession session) throws Exception {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("modifyUser");
		if (simpleUser == null) {
			String msg = "用户不存在！";
			return Msg.fail().add("msg", msg);
		} else {
			simpleUser.setSimplePassword(UtilsMD5.md5(psd));
			simpleUserService.updateSimpleUserInfo(simpleUser);
			String msg = "修改成功！";
			session.removeAttribute("modifyUser");
			return Msg.success().add("msg", msg);
		}
	}

	/**
	 * 第一步
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/modifyPasswordByMobileOne", method = RequestMethod.POST)
	public Msg modifyPasswordByMobileOne(String mobile, String code, HttpSession session) throws Exception {
		SimpleUser simpleUser = simpleUserService.getSimpleUser(mobile);
		if (simpleUser == null) {
			String msg = "用户不存在！或手机号错误！";
			return Msg.fail().add("msg", msg);
		} else {
			boolean state = simpleUserService.checkCode(code, mobile);
			if (state) {
				String msg = "验证码正确！";
				session.setAttribute("modifyUser", simpleUser);
				return Msg.success().add("msg", msg);
			} else {
				String msg = "验证码错误！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 测试session
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/returnSession", method = RequestMethod.POST)
	@ResponseBody
	public Msg returnSession(HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "未登入状态！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("simpleUser", simpleUser);
		}

	}

	/**
	 * 用户登出
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	@ResponseBody
	public Msg logout(HttpSession session) {
		session.removeAttribute("simpleUser");
		String msg = "退出！";
		return Msg.success().add("msg", msg);
	}

	/**
	 * 获取图片地址 测试
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getImagePath", method = RequestMethod.GET)
	@ResponseBody
	public Msg getImagePath() {
		List<ImageInfo> list = simpleUserService.getImagePath();
		if (list == null) {
			String msg = "无图片信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 查询所有职位 可能与下面的接口重复
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findAllPost", method = RequestMethod.GET)
	@ResponseBody
	public Msg findAllPost() {
		List<PostRelease> list = simpleUserService.findAllPost();
		if (list == null) {
			String msg = "暂无发布信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 职位详情
	 * 
	 * @param id
	 *            职位id
	 * @return
	 */
	@RequestMapping(value = "/backOnePost", method = RequestMethod.GET)
	@ResponseBody
	public Msg backOnePost(Integer id) {
		if (id == null) {
			String msg = "无参数！";
			return Msg.fail().add("msg", msg);
		} else {
			PostRelease post = simpleUserService.backOnePost(id);
			if (post == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				Integer test = post.getClicks();
				test += 1;
				post.setClicks(test);
				postReleaseService.updateClick(post);
				return Msg.success().add("post", post);
			}
		}
	}

	/**
	 * 按行业类别查找 可能与下面条件查询 与模糊查询重复
	 * 
	 * @param name
	 *            行业类别名称
	 * @return
	 */
	@RequestMapping(value = "/findPostByIndustryName", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByName(String name) {
		if (name == null) {
			String msg = "参数为空！";
			return Msg.fail().add("msg", msg);
		} else {
			List<PostRelease> list = simpleUserService.findPostByName(name);
			if (list == null) {
				String msg = "暂无此类职位发布信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("list", list);
			}
		}
	}

	/**
	 * 按职位类别查找 可能与下面条件查询 与模糊查询重复
	 * 
	 * @param name
	 *            职位类别
	 * @return
	 */
	@RequestMapping(value = "/findPostByPostitonType", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByPostitonType(String name) {
		if (name == null) {
			String msg = "参数为空！";
			return Msg.fail().add("msg", msg);
		} else {
			List<PostRelease> list = simpleUserService.findPostByPostitonType(name);
			if (list == null) {
				String msg = "暂无此类职位发布信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("list", list);
			}
		}
	}

	/**
	 * 按职位名称查询 可能与下面条件查询 与模糊查询重复
	 * 
	 * @param name
	 *            职位名称
	 * @return
	 */
	@RequestMapping(value = "/findPostByPostitonName", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByPostitonName(String name) {
		if (name == null) {
			String msg = "参数为空！";
			return Msg.fail().add("msg", msg);
		} else {
			List<PostRelease> list = simpleUserService.findPostByPostitonName(name);
			if (list == null) {
				String msg = "暂无此类职位发布信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("list", list);
			}
		}
	}

	/**
	 * 按公司职位查询 可能与下面条件查询 与模糊查询重复 需要使用
	 * 
	 * @param cPost
	 *            之定义bean类
	 * @return
	 */
	@RequestMapping(value = "/findPostByCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByCompany(CPost cPost) {
		Integer pn = cPost.getPn();
		String name = cPost.getName();
		String city = cPost.getCity();
		String industryName = cPost.getIndustryName();
		String positionName = cPost.getPositionName();
		String info = "不限";
		PageHelper.startPage(pn, 8);
		if (name == null) {
			String msg = "无参数！";
			return Msg.fail().add("msg", msg);
		} else {
			if (!city.equals(info) && !industryName.equals(info) && !positionName.equals(info)) {
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!city.equals(info) && !industryName.equals(info)) {
				positionName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!city.equals(info) && !positionName.equals(info)) {
				industryName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!positionName.equals(info) && !industryName.equals(info)) {
				city = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!city.equals(info)) {
				positionName = null;
				industryName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!positionName.equals(info)) {
				city = null;
				industryName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else if (!industryName.equals(info)) {
				city = null;
				positionName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				city = null;
				positionName = null;
				industryName = null;
				List<PostRelease> list = simpleUserService.findPostByMoreConditionsBycom(city, industryName,
						positionName, name);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list != null) {
					return Msg.success().add("list", pageinfo);
				} else {
					String msg = "暂无此类发布招聘信息！";
					return Msg.fail().add("msg", msg);
				}
			}
		}
	}

	/**
	 * 置顶公司 top字段
	 * 
	 * @return
	 */
	@RequestMapping(value = "/topCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg topCompany() {
		List<CompanyInfo> list = simpleUserService.topCompany();
		if (list == null) {
			String msg = "暂无公司信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 简历搜索页企业广告位！8个logo显示 字段c_company_type_two :topfind
	 * 
	 * 不详
	 * 
	 * 
	 */
	@RequestMapping(value = "/topCompanyFind", method = RequestMethod.GET)
	@ResponseBody
	public Msg topCompanyFind() {
		List<CompanyInfo> list = simpleUserService.topCompanyFind();
		if (list == null) {
			String msg = "暂无公司信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 返回全部公司列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findAllCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg findAllCompany() {
		List<CompanyInfo> list = simpleUserService.findAllCompany();
		if (list == null) {
			String msg = "暂无公司信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 返回公司信息
	 * 
	 * @param id
	 *            公司id
	 * @return
	 */
	@RequestMapping(value = "/companyInfoMsg", method = RequestMethod.GET)
	@ResponseBody
	public Msg companyInfoMsg(Integer id) {
		if (id == null) {
			String msg = "未检测到参数！";
			return Msg.fail().add("msg", msg);
		} else {
			CompanyInfo info = simpleUserService.companyInfoMsg(id);
			if (info == null) {
				String msg = "暂无公司信息！";
				return Msg.fail().add("msg", msg);
			} else {
				Integer click = simpleUserService.getClick(id);
				click += 1;
				info.setClicks(click);
				simpleUserService.updateCompanyClick(info);
				return Msg.success().add("info", info);
			}
		}
	}

	/**
	 * 模糊查询 暂时不用
	 * 
	 * @param pn
	 * @param city
	 * @param industryName
	 * @param positionName
	 * @return
	 */
	@RequestMapping(value = "/findPostByMoreCondition", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByMoreCondition(Integer pn, String city, String industryName, String positionName) {
		PageHelper.startPage(pn, 8);
		if (city.equals("undefined") && industryName.equals("undefined") && positionName == "") {
			List<PostRelease> list = simpleUserService.findAllPost();
			PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
			return Msg.success().add("list", pageinfo);
		} else {
			List<PostRelease> list = simpleUserService.findPostByMoreCondition(city, industryName, positionName);
			if (list == null) {
				String msg = "无此类职位信息！";
				return Msg.fail().add("msg", msg);
			} else {
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				return Msg.success().add("list", pageinfo);
			}
		}
	}

	/**
	 * 模糊查找发布中职位 暂时不用
	 */
	@RequestMapping(value = "/findPostByAnything", method = RequestMethod.GET)
	@ResponseBody
	public Msg findPostByAnything(String others, Integer pn) {
		PageHelper.startPage(pn, 8);
		List<PostRelease> list = simpleUserService.findPostByAnything(others);
		if (list == null) {
			String msg = "无此类职位信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
			return Msg.success().add("list", pageinfo);
		}
	}

	/**
	 * 返回公司信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getLessCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg getLessCompany(Integer id) {
		if (id == null) {
			String msg = "未检测到参数！";
			return Msg.fail().add("msg", msg);
		} else {
			PostRelease post = simpleUserService.backOnePost(id);
			CompanyInfo info = simpleUserService.getCompanyInfo(post.getcCompanyName());
			if (info == null) {
				String msg = "暂无公司信息！";
				return Msg.fail().add("msg", msg);
			} else {
				info.setId(null);
				info.setcAc(null);
				info.setcUserName(null);
				return Msg.success().add("info", info);
			}
		}
	}

	/**
	 * 推荐企业
	 */
	@RequestMapping(value = "/recommendCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg recommendCompany() {
		List<CompanyInfo> lists = simpleUserService.recommendCompany();
		if (lists == null) {
			String msg = "暂无推荐企业";
			return Msg.fail().add("msg", msg);
		} else {
			List<String> list = new ArrayList<String>();
			for (CompanyInfo companyInfo : lists) {
				list.add(companyInfo.getcCompanyName());
			}
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 模糊查询 与多条件查询
	 * 
	 * @param postRelease
	 * @param pn
	 * @return
	 */
	@RequestMapping(value = "/findByCondition", method = RequestMethod.GET)
	@ResponseBody
	public Msg findByCondition(PostRelease postRelease, Integer pn) {
		PageHelper.startPage(pn, 20);
		if ((postRelease.getpCity() != "" && postRelease.getpCity() != null)
				|| (postRelease.getpName() != "" && postRelease.getpName() != null)
				|| (postRelease.getpTypeOne() != "" && postRelease.getpTypeOne() != null)
				|| (postRelease.getpProvince() != "" && postRelease.getpProvince() != null)
				|| (postRelease.getpArea() != "" && postRelease.getpArea() != null)
				|| (postRelease.getpTypeOne() != "" && postRelease.getpTypeOne() != null)
				|| (postRelease.getpMajorOne() != "" && postRelease.getpMajorOne() != null)
				|| (postRelease.getcCompanyName() != "" && postRelease.getcCompanyName() != null)
				|| (postRelease.getpEducation() != "" && postRelease.getpEducation() != null)
				|| (postRelease.getCompanyTypeOne() != "" && postRelease.getCompanyTypeOne() != null)) {
			if (postRelease.getFindName() == null) {
				postRelease.setFindName(" ");
				postRelease.setpTyoeTwo(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
				List<PostRelease> list = simpleUserService.findByConditionIf(postRelease);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list == null) {
					String msg = "无此类发布信息！";
					return Msg.fail().add("msg", msg);
				} else {
					return Msg.success().add("list", pageinfo);
				}
			} else {
				postRelease.setFindName(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
				List<PostRelease> list = simpleUserService.findByConditionIf(postRelease);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list == null) {
					String msg = "无此类发布信息！";
					return Msg.fail().add("msg", msg);
				} else {
					return Msg.success().add("list", pageinfo);
				}
			}
		} else {
			if (postRelease.getFindName() == null) {
				postRelease.setFindName("");
				postRelease.setFindName(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
				List<PostRelease> list = simpleUserService.findByConditionOr(postRelease);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list == null) {
					String msg = "无此类发布信息！";
					return Msg.fail().add("msg", msg);
				} else {
					return Msg.success().add("list", pageinfo);
				}
			} else {
				postRelease.setFindName(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
				List<PostRelease> list = simpleUserService.findByConditionOr(postRelease);
				PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
				if (list == null) {
					String msg = "无此类发布信息！";
					return Msg.fail().add("msg", msg);
				} else {
					return Msg.success().add("list", pageinfo);
				}
			}
		}
	}

	/**
	 * 创建简历 可能不用
	 * 
	 * @param session
	 * @param resume
	 * @return
	 */
	@RequestMapping(value = "/setResume", method = RequestMethod.GET)
	@ResponseBody
	public Msg setResume(HttpSession session, Resume resume) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		}
		resume.setUserName(simpleUser.getSimpleName());
		if (resume.getMobile() != null && resume.getMobile() != "") {
			boolean state = simpleUserService.setResume(resume);
			if (state) {
				String msg = "创建成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "创建失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			resume.setMobile(simpleUser.getMobile());
			boolean state = simpleUserService.setResume(resume);
			if (state) {
				String msg = "创建成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "创建失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 简历上传
	 * 
	 * 待开发
	 * 
	 * @param files
	 * @param session
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	@RequestMapping(value = "/uploadResume", method = RequestMethod.POST)
	@ResponseBody
	public Msg uploadResume(MultipartFile files, HttpSession session, HttpServletRequest request)
			throws IllegalStateException, Exception {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (files.getName() != null) {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/userResume/"
					+ simpleUser.getSimpleName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "files/userResume/" + simpleUser.getSimpleName()
					+ "/" + files.getOriginalFilename();
			SimpleUser s = new SimpleUser();
			s.setId(simpleUser.getId());
			s.setResumePath(dataPath);
			boolean state = simpleUserService.updateSimpleUserInfo(s);
			if (state) {
				String msg = "上传成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "上传失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "为接收到文件！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 个人信息以及简历信息返回
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/getAllSimpleUserInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg getAllSimpleUserInfo(HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		}
		Resume resume = simpleUserService.getAllSimpleUserInfo(simpleUser.getMobile());
		if (resume == null) {
			String msg = "无简历信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("resume", resume);
		}
	}

	/**
	 * 个人信息以及简历信息返回
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/getResume", method = RequestMethod.GET)
	@ResponseBody
	public Msg getResume(HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			Resume resume = simpleUserService.getAllSimpleUserInfo(simpleUser.getMobile());
			return Msg.success().add("resume", resume);

		}
	}

	/**
	 * 修改个人信息
	 * 
	 * @param simpleUsers
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateSimpleUserInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg updateSimpleUserInfo(SimpleUser simpleUsers, HttpSession session) throws Exception {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		}
		simpleUsers.setId(simpleUser.getId());
		simpleUsers.setSimplePassword(null);
		simpleUsers.setResumePath(null);
		boolean state = simpleUserService.updateSimpleUserInfo(simpleUsers);
		if (state) {
			String msg = "修改成功";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "修改失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 个人简历修改
	 * 
	 * @param resume
	 * @return
	 */
	@RequestMapping(value = "/updateSimpleUserResume", method = RequestMethod.POST)
	@ResponseBody
	public Msg updateSimpleUserResume(Resume resumes, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		}
		Resume resume = simpleUserService.getAllSimpleUserInfo(simpleUser.getMobile());
		if (resume == null) {
			Resume resumess = new Resume();
			resumess.setRealName(simpleUser.getMobile());
			simpleUserService.setResume(resumess);
			String msg = "简历创建成功！";
			return Msg.success().add("msg", msg);
		} else {
			resumes.setMobile(simpleUser.getMobile());
			resumes.setEmail(simpleUser.getSimpleEmail());
			resumes.setId(resume.getId());
			System.out.println(resumes.getRealName()+resumes.getSex()+"this!!!!!!!!!!!"+resumes.getId());
			boolean state = simpleUserService.updateSimpleUserResume(resumes);
			if (state) {
				return Msg.success().add("resume", resume);
			} else {
				String msg = "修改失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 发送简历 求职发布信息id
	 * 
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/sendResume", method = RequestMethod.GET)
	@ResponseBody
	public Msg sendResume(HttpSession session, Integer ids) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		}
		GetResume getResume = new GetResume();
		Resume resume = simpleUserService.getAllSimpleUserInfo(simpleUser.getMobile());
		PostRelease post = postReleaseService.findPostById(ids);
		getResume.setPostSimpleResumeId(resume.getId());
		getResume.setPostId(ids);
		getResume.setPostCompanyId(post.getcId());
		getResume.setSimpleUserId(simpleUser.getId());
		getResume.setPostUserName(post.getcUserName());
		CompanyUser companyUser = simpleUserService.findPsotNameId(post.getcUserName());
		if (companyUser == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		}
		getResume.setPostUserIds(companyUser.getId());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(date);
		getResume.setSendTime(time.toString());
		boolean state = simpleUserService.sendResume(getResume);
		if (state) {
			String msg = "简历投递成！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "投递失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 简历投递情况
	 * 
	 */
	@RequestMapping(value = "/msgResume", method = RequestMethod.GET)
	@ResponseBody
	public Msg msgResume(Integer id, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入";
			return Msg.fail().add("msg", msg);
		} else {
			GetResume getResume = simpleUserService.msgResume(id, simpleUser.getId());
			if (getResume == null) {
				String msg = "未投递！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "已投递！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 查看关注企业状态 公司页等
	 * 
	 * @param session
	 * @param id企业id
	 * @return
	 */
	@RequestMapping(value = "/followCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg concernsCompany(HttpSession session, Integer id) {
		SimpleUser u = (SimpleUser) session.getAttribute("simpleUser");
		if (u == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			boolean state = simpleUserService.checkFollowCompany(u.getId(), id);
			if (state) {
				String msg = "未关注！";
				return Msg.fail().add("msg", msg);
			} else {
				String msg = "已关注！";
				return Msg.success().add("msg", msg);
			}
		}
	}

	/**
	 * 关注企业
	 * 
	 * @param session
	 * @param id企业id
	 * @return
	 */
	@RequestMapping(value = "/clickFollowCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg clickFollowCompany(HttpSession session, Integer id) {
		SimpleUser u = (SimpleUser) session.getAttribute("simpleUser");
		if (u == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			CompanyInfo companyInfo = simpleUserService.getCompanyInfoById(id);
			companyInfo.setCollNum(companyInfo.getCollNum() + 1);
			simpleUserService.updateCompanyClick(companyInfo);
			boolean state = simpleUserService.checkFollowCompany(u.getId(), id);
			boolean states = simpleUserService.followCompany(u.getId(), id);
			if (state && states) {
				String msg = "关注成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "关注失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 查看关注公司
	 */
	@RequestMapping(value = "/showFollowCompany", method = RequestMethod.GET)
	@ResponseBody
	public Msg showFollowCompany(HttpSession session) {
		SimpleUser u = (SimpleUser) session.getAttribute("simpleUser");
		if (u == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			List<Map<String, Object>> list = simpleUserService.showFollowCompany(u.getId());
			if (list == null) {
				String msg = "暂无关注企业！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("list", list);
			}
		}
	}

	/**
	 * 最新招聘职位 10个 要可设置
	 * 
	 * @return
	 */
	@RequestMapping(value = "/theFirstPostRelease", method = RequestMethod.GET)
	@ResponseBody
	public Msg theFirstPostRelease() {
		List<Map<String, Object>> list = postReleaseService.theFirstPostRelease();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 
	 * 知名企业信息
	 */
	@RequestMapping(value = "/theHotCompanyInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg theHotCompanyInfo() {
		List<Map<String, Object>> list = simpleUserService.theHotCompanyInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				List<Map<String, Object>> list3 = postReleaseService
						.getPostListByCompanyName(list.get(i).get("cCompanyName"));
				List<Map<String, Object>> list2 = postReleaseService
						.getAllPostListByCompanyName(list.get(i).get("cCompanyName"));
				if (list2 != null && list3 != null) {
					for (int j = 0; j < list2.size(); j++) {
						list.get(i).put("postId" + j, list2.get(j).get("id"));
						list.get(i).put("postName" + j, list2.get(j).get("pTyoeTwo"));

					}
				} else {
					String msg = "无企业发布职位信息！";
					list.get(i).put("msg", msg);
				}
				list.get(i).put("size", list2.size());
			}
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 首页滚动条
	 * 
	 */
	@RequestMapping(value = "/indexScrollBarCompanyInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg indexScrollBarCompanyInfo() {
		List<Map<String, Object>> list = simpleUserService.indexScrollBarCompanyInfo();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				List<Map<String, Object>> list2 = postReleaseService
						.getPostListByCompanyNameHot(list.get(i).get("cCompanyName"));
				if (list2 == null) {
					continue;
				}
				String[] hotPost = new String[4];
				for (int j = 0; j < list2.size(); j++) {
					hotPost[j] = (String) list2.get(j).get("pName");
					list.get(i).put("hotPost", hotPost);
				}
			}
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 首页指导
	 * 
	 */
	@RequestMapping(value = "/indexArticle", method = RequestMethod.GET)
	@ResponseBody
	public Msg indexArticle() {
		List<Map<String, Object>> list = simpleUserService.indexArticle();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				List<Map<String, Object>> lists = simpleUserService.getallArticleListByFatherId(list.get(i).get("id"));
				List<Map<String , Object>> listfinall = new ArrayList<Map<String,Object>>();
				for(int j = 0 ; j < 5 ; j ++){
					listfinall.add(lists.get(j));
				}
				list.get(i).put("ArticleList", listfinall);
			}
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 获取文章
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getArticleListById", method = RequestMethod.GET)
	@ResponseBody
	public Msg getArticleListById(Integer id) {
		ArticleList articleList = simpleUserService.getArticleListById(id);
		if (articleList == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer clickNum = articleList.getArticleListClickNum();
			clickNum++;
			articleList.setArticleListClickNum(clickNum);
			adminService.updateArticleList(articleList);
			return Msg.success().add("articleList", articleList);
		}
	}

	/**
	 * 首页指导查看更多
	 */
	@RequestMapping(value = "/indexMoreArticle", method = RequestMethod.GET)
	@ResponseBody
	public Msg indexMoreArticle(Integer id) {
		Article article = simpleUserService.indexMoreArticle(id);
		Integer clickNum = article.getArticleClickNum();
		clickNum++;
		article.setArticleClickNum(clickNum);
		adminService.updateArticle(article);
		List<Map<String, Object>> list = simpleUserService.getallArticleListByFatherId(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list).add("fatherName", article.getArticleName());
		}
	}

	/**
	 * 指导阅读排行10个
	 */
	@RequestMapping(value = "/getRankingList", method = RequestMethod.GET)
	@ResponseBody
	public Msg getRankingList() {
		List<ArticleList> list = simpleUserService.getRankingList();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 收藏职位
	 * 
	 * @param id
	 *            职位id
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/collectionPost", method = RequestMethod.GET)
	@ResponseBody
	public Msg collectionPost(Integer id, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		} else {
			boolean check = adminService.checkCollection(id, simpleUser.getId());
			if (check) {
				String msg = "已收藏！";
				return Msg.fail().add("msg", msg);
			} else {
				boolean state = adminService.collectionPost(id, simpleUser.getId());
				if (state) {
					String msg = "收藏成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "失败！";
					return Msg.fail().add("msg", msg);
				}
			}
		}
	}

	/**
	 * 实习生列表
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getUserStyle", method = RequestMethod.GET)
	public Msg getUserStyle(Integer pn) {
		PageHelper.startPage(pn, 8);
		List<Map<String, String>> list = adminService.getUserStyle();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<Map<String, String>> pageInfo = new PageInfo<Map<String, String>>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 查看实习生详情
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/seeUserStyle", method = RequestMethod.GET)
	public Msg seeUserStyle(Integer id, HttpSession session) {
		CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
		if (companyUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			Resume resume = simpleUserService.seeUserStyle(id);
			if (resume == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("resume", resume);
			}
		}
	}

	/**
	 * 资质查询
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/checkQualifications", method = RequestMethod.POST)
	public Msg checkQualifications(AualificationCertification aualificationCertification) {
		AualificationCertification state = adminService.checkQualifications(aualificationCertification);
		if (state == null) {
			String msg = "无信息";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("state", state);
		}
	}
}
