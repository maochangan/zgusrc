package net.zgysrc.www.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.zgysrc.www.bean.AdminUser;
import net.zgysrc.www.bean.Article;
import net.zgysrc.www.bean.ArticleList;
import net.zgysrc.www.bean.AualificationCertification;
import net.zgysrc.www.bean.BookTypes;
import net.zgysrc.www.bean.CarouselPic;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.ImageInfo;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.bean.SimplePrice;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.service.AdminService;
import net.zgysrc.www.service.simservice.SimpleUserService;
import net.zgysrc.www.utils.Configuration;
import net.zgysrc.www.utils.Msg;
import net.zgysrc.www.utils.UtilStringBufferToString;
import net.zgysrc.www.utils.UtilsMD5;

/**
 * 后台管理模块
 * 
 * @author Administrator
 * 
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "adminController")
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private SimpleUserService simpleUserService;

	/**
	 * 管理员用户登入
	 */
	@ResponseBody
	@RequestMapping(value = "/adminUserLogoin", method = RequestMethod.GET)
	public Msg adminUserLogoin(AdminUser adminUser) {
		boolean state = adminService.adminUserLogoin(adminUser);
		if (state) {
			String msg = "登入成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "用户名密码错误";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 查询所有企业
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/companyFindAll", method = RequestMethod.GET)
	public Msg companyFindAll(Integer pn, Integer size) {
		PageHelper.startPage(pn, size);
		List<CompanyInfo> list = adminService.companyFindAll();
		if (list.size() != 0) {
			PageInfo<CompanyInfo> pageInfo = new PageInfo<CompanyInfo>(list);
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			String msg = "暂无企业记录";
			return Msg.success().add("msg", msg);
		}
	}

	/**
	 * 查询所有企业
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyListAll", method = RequestMethod.GET)
	public Msg getCompanyListAll(Integer pn, Integer pSize) {
		PageHelper.startPage(pn, pSize);
		List<CompanyInfo> list = adminService.companyFindAll();
		PageInfo<CompanyInfo> pageInfo = new PageInfo<CompanyInfo>(list);
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 返回一个公司 根据id
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyInfo", method = RequestMethod.GET)
	public Msg getCompanyInfo(Integer id) {
		CompanyInfo companyInfo = adminService.checkCompanyInfo(id);
		return Msg.success().add("companyInfo", companyInfo);
	}

	/**
	 * 成员信息
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyUserInfo", method = RequestMethod.GET)
	public Msg getCompanyUserInfo(Integer id) {
		CompanyUser companyUser = adminService.getCompanyUserInfo(id);

		if (companyUser == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("companyUser", companyUser);
		}
	}

	/**
	 * 企业管理员
	 * 
	 * @param cCompanyName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/companyFindCompanyUser", method = RequestMethod.GET)
	public Msg companyFindCompanyUser(String cCompanyName) {
		List<CompanyUser> list = adminService.companyFindCompanyUser(cCompanyName);
		if (list.size() != 0) {
			return Msg.success().add("list", list);
		} else {
			String msg = "暂无企业管理员账户信息";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 全部企业用户
	 */
	@ResponseBody
	@RequestMapping(value = "/companyAllUser", method = RequestMethod.GET)
	public Msg companyAllUser() {
		List<CompanyUser> list = adminService.companyAllUser();
		if (list.size() == 0) {
			String msg = "暂无用户信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}

	}

	/**
	 * 添加企业
	 * 
	 * @param companyInfo
	 * @return
	 * @throws Exception
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	public Msg addCompany(CompanyInfo companyInfo, MultipartFile files, MultipartFile filesLicense,
			List<MultipartFile> pic, HttpServletRequest request) throws IllegalStateException, Exception {
		if (companyInfo.getcCompanyName() != null && companyInfo.getcUserName() != null
				&& files.getOriginalFilename() != null || filesLicense.getOriginalFilename() != null) {
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

			String pathLicense = request.getSession().getServletContext().getRealPath("/") + "files/pic/license/"
					+ companyInfo.getcCompanyName() + "/" + filesLicense.getOriginalFilename();
			File dirLicense = new File(pathLicense);
			if (!dirLicense.exists()) {
				dirLicense.mkdirs();
			}
			files.transferTo(dirLicense);
			String dataPathLicense = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/license/"
					+ companyInfo.getcCompanyName() + "/" + filesLicense.getOriginalFilename();
			if (pic.size() == 0) {
				companyInfo.setBusinessLicense(dataPathLicense);
				companyInfo.setcCompanyLogo(dataPath);
				boolean state = adminService.addCompany(companyInfo);
				if (state) {
					String msg = "添加成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "添加失败！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < pic.size(); i++) {
					String patha = request.getSession().getServletContext().getRealPath("/") + "files/pic/pic/"
							+ companyInfo.getcCompanyName() + "/" + pic.get(i).getOriginalFilename();
					File dira = new File(patha);
					if (!dira.exists()) {
						dira.mkdirs();
					}
					files.transferTo(dira);
					String dataPatha = "http://" + Configuration.IP + ":" + request.getLocalPort()
							+ request.getServletContext().getContextPath() + "/files/pic/pic/"
							+ companyInfo.getcCompanyName() + "/" + pic.get(i).getOriginalFilename();
					sb.append(dataPatha).append(",");
				}
				sb.deleteCharAt(sb.length() - 1);
				companyInfo.setcCompanyPic(sb.toString());
				companyInfo.setBusinessLicense(dataPathLicense);
				companyInfo.setcCompanyLogo(dataPath);
				boolean state = adminService.addCompany(companyInfo);
				if (state) {
					String msg = "添加成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "添加失败！";
					return Msg.fail().add("msg", msg);
				}
			}
		} else {
			String msg = "添加失败！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 删除企业
	 */
	@ResponseBody
	@RequestMapping(value = "/dropCompany", method = RequestMethod.GET)
	public Msg dropCompany(Integer id) {
		boolean state = adminService.dropCompany(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 添加企业用户
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addCompanyUser", method = RequestMethod.POST)
	public Msg addCompanyUser(CompanyUser companyUser, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		companyUser.setcPassword(UtilsMD5.md5(companyUser.getcPassword()));
		if (companyUser.getcName() != null && companyUser.getcUserName() != null
				&& companyUser.getcTelephoneNumber() != null) {
			boolean stateName = adminService.findByName(companyUser);
			boolean stateTel = adminService.findByTel(companyUser);
			boolean stateEmail = adminService.findByEmial(companyUser);
			if (stateName && stateTel && stateEmail) {
				String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/image/"
						+ companyUser.getcUserName() + "/" + files.getOriginalFilename();
				File dir = new File(path);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				files.transferTo(dir);
				String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
						+ request.getServletContext().getContextPath() + "/files/pic/image/"
						+ companyUser.getcUserName() + "/" + files.getOriginalFilename();
				companyUser.setcImage(dataPath);
				Date date = new Date();
				companyUser.setCreateDate(date);
				boolean state = adminService.addCompanyUser(companyUser);
				if (state) {
					String msg = "添加成功！";
					return Msg.success().add("msg", msg);
				} else {
					String msg = "添加失败！";
					return Msg.fail().add("msg", msg);
				}
			} else {
				String msg = "用户已存在 ，请检查用户名与手机号和邮箱地址！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "添加失败111！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 获得企业用户信息
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyUserName", method = RequestMethod.GET)
	public Msg getCompanyUserName(String cCompanyName) {
		List<CompanyUser> list = adminService.getCompanyUserName(cCompanyName);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}

	}

	/**
	 * 根据成员id获取发布职位
	 */
	@ResponseBody
	@RequestMapping(value = "/getPostReleaseByUserId", method = RequestMethod.GET)
	public Msg getPostReleaseByUserId(Integer id) {
		List<Map<String, Object>> list = adminService.getPostReleaseByUserId(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 
	 * 根据企业id获取企业发布职位
	 */
	@ResponseBody
	@RequestMapping(value = "/getPostReleaseByCompanyId", method = RequestMethod.GET)
	public Msg getPostReleaseByCompanyId(Integer id) {
		List<PostRelease> list = adminService.getPostReleaseByCompanyId(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 发布中的职位id删除
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/deletePostReleaseById", method = RequestMethod.GET)
	public Msg deletePostReleaseById(Integer id) {
		boolean state = adminService.deletePostReleaseById(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 职位发布列表
	 */
	@ResponseBody
	@RequestMapping(value = "/positionList", method = RequestMethod.GET)
	public Msg positionList() {
		List<PostRelease> list = adminService.positionList();
		if (list == null) {
			String msg = "暂无职位发布数据！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 查询发布职位 搜索 待开发 test
	 * 
	 * @param postRelease
	 * @param pn
	 * @return
	 */
	@RequestMapping(value = "/getPostReleaseByCompanyIdtest", method = RequestMethod.GET)
	@ResponseBody
	public Msg getPostReleaseByCompanyIdtest(PostRelease postRelease, Integer pn) {
		PageHelper.startPage(pn, 8);
		if (postRelease.getFindName() == null) {
			postRelease.setFindName(" ");
			postRelease.setpTyoeTwo(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
			List<PostRelease> list = simpleUserService.findByConditionIf(postRelease);
			PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
			if (list == null) {
				String msg = "无此类发布信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("pageinfo", pageinfo);
			}
		} else {
			postRelease.setFindName(UtilStringBufferToString.stringBufferToString(postRelease.getFindName()));
			List<PostRelease> list = simpleUserService.findByConditionIf(postRelease);
			PageInfo<PostRelease> pageinfo = new PageInfo<PostRelease>(list);
			if (list == null) {
				String msg = "无此类发布信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("pageinfo", pageinfo);
			}
		}
	}

	/**
	 * 添加发布职位
	 */
	@ResponseBody
	@RequestMapping(value = "/addPosition", method = RequestMethod.GET)
	public Msg addPosition(PostRelease postRelease) {
		CompanyInfo companyInfo = adminService.findCompanyInfoByName(postRelease.getcCompanyName());
		postRelease.setcId(companyInfo.getId());
		Date d = new Date();
		postRelease.setpStartTime(String.valueOf(d.getTime()));
		if (postRelease.getcCompanyName() != null && postRelease.getcUserName() != null
				&& postRelease.getpName() != null && postRelease.getpNumber() != null) {
			CompanyInfo info = adminService.findCompanyInfoByName(postRelease.getcCompanyName());
			postRelease.setcCompanyLogo(info.getcCompanyLogo());
			postRelease.setClicks(0);
			boolean state = adminService.addPosition(postRelease);
			if (state) {
				String msg = "添加成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "添加失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "添加失败！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 获取职位详情id
	 */
	@ResponseBody
	@RequestMapping(value = "/getPostById", method = RequestMethod.GET)
	public Msg getPostById(Integer id) {
		PostRelease postRelease = adminService.getPostById(id);
		if (postRelease == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("postInfo", postRelease);
		}
	}

	/**
	 * 审核设置 private String cAc;字段 实体类封装 需要id
	 * 
	 * @param companyInfo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/reviewCompany", method = RequestMethod.GET)
	public Msg reviewCompany(CompanyInfo companyInfo) {
		boolean state = adminService.reviewCompany(companyInfo);
		if (state) {
			String msg = "审核成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "审核失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * private String top; companyInfo id; 置顶设置首页
	 */
	@ResponseBody
	@RequestMapping(value = "/setTopCompanyIndex", method = RequestMethod.GET)
	public Msg setTopCompanyIndex(CompanyInfo companyInfo) {
		boolean state = adminService.getTopCompanyIndex();
		if (state) {
			boolean settop = adminService.setTopCompanyIndex(companyInfo);
			if (settop) {
				String msg = "设置置顶成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "设置失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "置顶失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * private String top; companyInfo id; 取消置顶
	 */
	@ResponseBody
	@RequestMapping(value = "/setTopCompanyIndexOff", method = RequestMethod.GET)
	public Msg setTopCompanyIndexOff(CompanyInfo companyInfo) {
		boolean settop = adminService.setTopCompanyIndex(companyInfo);
		if (settop) {
			String msg = "取消置顶成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "设置失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 职位列表页推荐公司设置8个 companytypetwo：topfind
	 * 
	 * @param companyInfo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/setTopCompanyPostRelease", method = RequestMethod.GET)
	public Msg setTopCompanyPostRelease(CompanyInfo companyInfo) {
		boolean state = adminService.getTopCompanyPostRelease();
		if (state) {
			boolean settop = adminService.setTopCompanyPostRelease(companyInfo);
			if (settop) {
				String msg = "设置置顶成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "设置失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			boolean settop = adminService.setTopCompanyPostRelease(companyInfo);
			if (settop) {
				String msg = "取消置顶成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "设置失败！";
				return Msg.fail().add("msg", msg);
			}
		}
	}

	/**
	 * 实习生列表
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllTrainee", method = RequestMethod.GET)
	public Msg getAllTrainee() {

		return null;
	}

	/**
	 * 普通用户数量
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllSimpleUsrNum", method = RequestMethod.GET)
	public Msg getAllSimpleUsrNum() {
		int size = adminService.getAllSimpleUsrNum();
		return Msg.success().add("size", size);
	}

	/**
	 * 普通用户列表
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllSimpleUsrList", method = RequestMethod.GET)
	public Msg getAllSimpleUsrList() {
		List<SimpleUser> list = adminService.getAllSimpleUsrList();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 普通用户列表
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllSimpleUsrListAll", method = RequestMethod.GET)
	public Msg getAllSimpleUsrListAll(Integer pn, Integer pSize, String mobile) {
		PageHelper.startPage(pn, pSize);
		List<SimpleUser> list = adminService.getAllSimpleUsrListAll(mobile);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<SimpleUser> pageInfo = new PageInfo<SimpleUser>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 普通用户删除
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteSimpleUserById", method = RequestMethod.GET)
	public Msg deleteSimpleUserById(Integer id) {
		boolean state = adminService.deleteSimpleUserById(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 查看普通用户信息加简历信息
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getSimpleUserInfo", method = RequestMethod.GET)
	public Msg getSimpleUserInfo(Integer id) {
		SimpleUser simpleUser = adminService.getSimpleUserInfo(id);
		if (simpleUser == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Resume resume = adminService.getResumeByUserMobile(simpleUser.getMobile());
			return Msg.success().add("simpleUser", simpleUser).add("resume", resume);
		}
	}

	/**
	 * 数量统计
	 */
	@ResponseBody
	@RequestMapping(value = "/indexSize", method = RequestMethod.GET)
	public Msg indexSize() {
		int companyNum = adminService.getCompanySize();
		int simpleUserNum = adminService.getAllSimpleUsrNum();
		int postNum = adminService.getPostSize();
		return Msg.success().add("companyNum", companyNum).add("simpleUserNum", simpleUserNum).add("postNum", postNum);
	}

	/**
	 * 添加文章
	 * 
	 * @param articleList
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addArticleList", method = RequestMethod.GET)
	public Msg addArticleList(ArticleList articleList) {
		Article article = adminService.getArticle(articleList.getArticleFatherName());
		articleList.setArticleListClickNum(0);
		articleList.setArticleListFatherId(article.getId());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
		String time = sdf.format(date);
		articleList.setArticleListCreateTime(time);
		boolean state = adminService.addArticleList(articleList);
		if (state) {
			String msg = "添加成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "添加失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 获取文章类型id
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getArticle", method = RequestMethod.GET)
	public Msg getArticle() {
		List<Map<String, Object>> list = simpleUserService.indexArticle();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 获取全部文章
	 */
	@ResponseBody
	@RequestMapping(value = "/getArticleListAll", method = RequestMethod.GET)
	public Msg getAllArticleList(Integer pn, Integer pSize, String articleListName, String articleFatherName) {
		PageHelper.startPage(pn, pSize);
		List<ArticleList> list = adminService.getAllArticleList(articleListName, articleFatherName);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<ArticleList> pageInfo = new PageInfo<ArticleList>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 得到文章
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getArticleLists", method = RequestMethod.GET)
	public Msg getArticleLists(Integer id) {
		ArticleList articleList = adminService.getArticleLists(id);
		return Msg.success().add("info", articleList);

	}

	/**
	 * 修改文章
	 * 
	 * @param articleList
	 *            文章id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateArticleList", method = RequestMethod.GET)
	public Msg updateArticleList(ArticleList articleList) {
		boolean state = adminService.updateArticleList(articleList);
		if (state) {
			String msg = "修改成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "修改失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除文章
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteArticleList", method = RequestMethod.GET)
	public Msg deleteArticleList(Integer id) {
		boolean state = adminService.deleteArticleList(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 检查滚动条设置
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/checkScrollBar", method = RequestMethod.GET)
	public Msg checkScrollBar(Integer id) {
		boolean state = adminService.checkScrollBar();
		if (state) {
			boolean setting = adminService.setScrollBar(id);
			if (setting) {
				String msg = "设置成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "设置失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "超出上限!";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 检查滚动条设置取消
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/removeScrollBar", method = RequestMethod.GET)
	public Msg removeScrollBar(Integer id) {
		boolean state = adminService.checkScrollBar(id);
		if (state) {
			boolean states = adminService.removeScrollBar(id);
			if (states) {
				String msg = "取消置顶成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "设置失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "已设置！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 资格列表
	 */
	@ResponseBody
	@RequestMapping(value = "/getAualificationCertificationList", method = RequestMethod.GET)
	public Msg getAualificationCertificationList(Integer pn, Integer pSize, String name) {
		PageHelper.startPage(pn, pSize);
		List<AualificationCertification> list = adminService.getAualificationCertificationList(name);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<AualificationCertification> pageInfo = new PageInfo<AualificationCertification>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 资格录入 addAualificationCertification
	 */
	@ResponseBody
	@RequestMapping(value = "/addAualificationCertification", method = RequestMethod.POST)
	public Msg addAualificationCertification(AualificationCertification aualificationCertification) {
		boolean state = adminService.addAualificationCertification(aualificationCertification);
		if (state) {
			String msg = "添加成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "添加失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 资格删除
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteAcF", method = RequestMethod.GET)
	public Msg deleteAcF(Integer id) {
		boolean state = adminService.deleteAcF(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 企业列表 带筛选
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllCompanyListWithExamine", method = RequestMethod.GET)
	public Msg getAllCompanyList(Integer pn, Integer pSize, String examine, String companyName) {
		PageHelper.startPage(pn, pSize);
		List<CompanyInfo> list = adminService.getAllCompanyListWithExamine(examine, companyName);
		if (list == null) {
			String msg = "无需审核企业！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<CompanyInfo> pageInfo = new PageInfo<CompanyInfo>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 
	 * 需要审核的企业
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllNeedReview", method = RequestMethod.GET)
	public Msg getAllNeedReview() {
		List<CompanyInfo> list = adminService.getAllNeedReview();
		if (list == null) {
			String msg = "无需审核企业！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 审核未通过企业
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllNotReviewCompany", method = RequestMethod.GET)
	public Msg getAllNotReviewCompany() {
		List<CompanyInfo> list = adminService.getAllNotReviewCompany();
		if (list == null) {
			String msg = "无未通过审核企业!";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 自己添加企业 需逐步删除
	 */
	@ResponseBody
	@RequestMapping(value = "/getAddByAdminCompany", method = RequestMethod.GET)
	public Msg getAddByAdminCompany() {
		List<CompanyInfo> list = adminService.getAddByAdminCompany();
		if (list == null) {
			String msg = "无自己添加企业!";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 图书馆分类
	 */
	@ResponseBody
	@RequestMapping(value = "/getBookType", method = RequestMethod.GET)
	public Msg getBookType() {
		List<BookTypes> list = adminService.getBookType();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 添加图书馆分类
	 * 
	 * @param bookTypes
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addBookType", method = RequestMethod.GET)
	public Msg addBookType(BookTypes bookTypes) {
		boolean state = adminService.addBookTypes(bookTypes);
		if (state) {
			String msg = "添加成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "添加失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 修改分类 id
	 * 
	 * @param bookTypes
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateBookType", method = RequestMethod.GET)
	public Msg updateBookType(BookTypes bookTypes) {
		boolean state = adminService.updateBookType(bookTypes);
		if (state) {
			String msg = "修改成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "修改失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 轮播列表首页
	 */
	@ResponseBody
	@RequestMapping(value = "/getIndexPicList", method = RequestMethod.GET)
	public Msg getIndexPicList() {
		List<ImageInfo> list = adminService.getIndexPicList();
		if (list == null) {
			return Msg.fail().add("msg", "无信息！");
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 其他列表首页
	 */
	@ResponseBody
	@RequestMapping(value = "/getAnotherPicList", method = RequestMethod.GET)
	public Msg getAnotherPicList() {
		List<CarouselPic> list = adminService.getAnotherPicList();
		if (list == null) {
			return Msg.fail().add("msg", "无信息！");
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 轮播设置 首页三个
	 * 
	 * @throws Exception
	 * @throws IllegalStateException
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/updateIndexPic", method = RequestMethod.POST)
	public Msg updateIndexPic(MultipartFile files, ImageInfo imageInfo, HttpServletRequest request)
			throws IllegalStateException, Exception {
		String path = request.getSession().getServletContext().getRealPath("/") + "files/CarouselPic/pic2/"
				+ files.getOriginalFilename();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		files.transferTo(dir);
		String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
				+ request.getServletContext().getContextPath() + "/files/CarouselPic/pic2/"
				+ files.getOriginalFilename();
		imageInfo.setImgPath(dataPath);
		System.out.println(dataPath);
		boolean state = adminService.updateImageInfo(imageInfo);
		if (state) {
			return Msg.success().add("msg", "修改成功！");
		} else {
			return Msg.fail().add("msg", "修改失败！");
		}
	}

	/**
	 * 轮播设置 其他三个
	 * 
	 * @throws Exception
	 * @throws Exception
	 * @throws IllegalStateException
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/updateAnotherPic", method = RequestMethod.POST)
	public Msg updateAnotherPic(MultipartFile files, CarouselPic carouselPic, HttpServletRequest request)
			throws IllegalStateException, Exception {
		String path = request.getSession().getServletContext().getRealPath("/") + "files/CarouselPic/pic2/"
				+ files.getOriginalFilename();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		files.transferTo(dir);
		String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
				+ request.getServletContext().getContextPath() + "/files/CarouselPic/pic2/"
				+ files.getOriginalFilename();
		carouselPic.setImagePath(dataPath);
		boolean state = adminService.updateCarouselPic(carouselPic);
		if (state) {
			return Msg.success().add("msg", "修改成功！");
		} else {
			return Msg.fail().add("msg", "修改失败！");
		}
	}

	/**
	 * 支付设置
	 */
	@ResponseBody
	@RequestMapping(value = "/getSimpelVipInfo", method = RequestMethod.GET)
	public Msg getSimpelVipInfo() {
		List<SimplePrice> list = adminService.getSimpelVipInfo();
		if (list == null) {
			return Msg.fail().add("msg", "无信息！");
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 添加修改普通用户vip价格
	 */
	@ResponseBody
	@RequestMapping(value = "/updateSimpelVipInfo", method = RequestMethod.GET)
	public Msg updateSimpelVipInfo(SimplePrice simplePrice) {
		boolean state = adminService.updateSimpelVipInfo(simplePrice);
		if (state) {
			return Msg.success().add("msg", "修改成功！");
		} else {
			return Msg.fail().add("msg", "修改失败！");
		}
	}

	/**
	 * 企业vip收费设置列表
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyPriceList", method = RequestMethod.GET)
	public Msg getCompanyPriceList() {
		List<CompanyVip> list = adminService.getCompanyPriceList();
		if (list == null) {
			return Msg.fail().add("msg", "无信息！");
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 企业vip收费设置列表 设置
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/updateCompanyPriceList", method = RequestMethod.GET)
	public Msg updateCompanyPriceList(CompanyVip companyVip) {
		boolean state = adminService.updateCompanyPriceList(companyVip);
		if (state) {
			return Msg.success().add("msg", "修改成功！");
		} else {
			return Msg.fail().add("msg", "修改失败！");
		}
	}

}
