package net.zgysrc.www.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.zgysrc.www.bean.CarouselPic;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyType;
import net.zgysrc.www.bean.CompanyTypes;
import net.zgysrc.www.bean.HatArea;
import net.zgysrc.www.bean.HatCity;
import net.zgysrc.www.bean.HatProvince;
import net.zgysrc.www.bean.IndustryCategory;
import net.zgysrc.www.bean.PositionName;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostitonType;
import net.zgysrc.www.service.UtilsControllerService;
import net.zgysrc.www.utils.Msg;
import net.zgysrc.www.utils.NetDownUtil;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "utilsController")
@Controller
public class UtilsController {

	@Autowired
	private UtilsControllerService utilsControllerService;

	/**
	 * 公司类型
	 * 
	 * @param cType
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */

	@RequestMapping(value = "/addCompanyType", method = RequestMethod.GET)
	@ResponseBody
	public Msg addCompanyType(CompanyType cType, Model model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		if (cType.getConpanyType() != null) {
			boolean state = utilsControllerService.addCompanyType(cType);
			if (state) {
				String msg = "添加成功";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "添加失败";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "参数为空！";
			return Msg.fail().add("msg", msg);
		}

	}

	/**
	 * 删除公司类型
	 * 
	 * @param cType
	 * @return
	 */
	@RequestMapping(value = "/dropCompanyType", method = RequestMethod.GET)
	@ResponseBody
	public Msg dropCompanyType(Integer id) {
		boolean state = utilsControllerService.dropType(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 公司类型列表 TODO 在用
	 * 
	 * @return
	 */
	@RequestMapping(value = "/companyType", method = RequestMethod.GET)
	@ResponseBody
	public Msg companyType() {
		List<CompanyType> cType = utilsControllerService.findAll();
		return Msg.success().add("companyType", cType);

	}

	/**
	 * 行业类型 TODO
	 */
	@RequestMapping(value = "/industryCategory", method = RequestMethod.GET)
	@ResponseBody
	public Msg industryCategory() {
		List<IndustryCategory> list = utilsControllerService.findIndustryAll();
		return Msg.success().add("industryCategory", list);
	}

	/**
	 * 获取中国省份 TODO 在用
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAllprovince", method = RequestMethod.GET)
	@ResponseBody
	public Msg getAllprovince() {
		List<HatProvince> list = utilsControllerService.getAllprovince();
		if (list == null) {
			String msg = "无记录！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 获取市 TODO
	 */
	@RequestMapping(value = "/getCity", method = RequestMethod.GET)
	@ResponseBody
	public Msg getCity(String id) {
		List<HatCity> list = utilsControllerService.getCity(id);
		if (list == null) {
			String msg = "无记录！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 热门信息 TODO
	 */
	@RequestMapping(value = "/hotMessage", method = RequestMethod.GET)
	@ResponseBody
	public Msg hotMessage() {
		List<CompanyInfo> hotCompany = utilsControllerService.getHotCompany();
		List<PositionName> hotPost = utilsControllerService.getHotPostName();
		if (hotCompany == null && hotPost == null) {
			String msg = "无热门信息！";
			return Msg.fail().add("msg", msg);
		} else {
			List<String> list = new ArrayList<String>();
			for (CompanyInfo companyInfo : hotCompany) {
				list.add(companyInfo.getcCompanyName());
			}
			return Msg.success().add("hotPost", hotPost).add("hotCompany", list);
		}
	}

	/**
	 * 获得轮播图片招聘专场 TODO
	 * 
	 * @return
	 */
	@RequestMapping(value = "/carouselPic", method = RequestMethod.GET)
	@ResponseBody
	public Msg carouselPic() {
		List<CarouselPic> list = utilsControllerService.carouselPic();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 获得轮播图片校园招聘 TODO
	 * 
	 * @return
	 */
	@RequestMapping(value = "/carouselPicScl", method = RequestMethod.GET)
	@ResponseBody
	public Msg carouselPicScl() {
		List<CarouselPic> list = utilsControllerService.carouselPicScl();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * TODO 在用
	 */
	@ResponseBody
	@RequestMapping(value = "/getCompanyTypes", method = RequestMethod.GET)
	public Msg getCompanyTypes() {
		List<CompanyTypes> list = utilsControllerService.getCompanyTypes();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("industryCategory", list);
		}
	}
	
	

	// TODO
	// 不使用/////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 删除行业类别
	 * 
	 * @param industryCategory
	 * @return
	 */
	@RequestMapping(value = "/industryCategoryDrop", method = RequestMethod.GET)
	@ResponseBody
	public Msg industryCategoryDrop(Integer id) {
		if (id != null) {
			boolean state = utilsControllerService.industryCategoryDrop(id);
			if (state) {
				String msg = "删除成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "删除失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "参数不能为空！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 增加行业类别
	 * 
	 * @param industryCategory
	 * @return
	 */
	@RequestMapping(value = "/industryCategoryAdd", method = RequestMethod.GET)
	@ResponseBody
	public Msg industryCategoryAdd(IndustryCategory industryCategory) {
		if (industryCategory.getIndustryCategory() != null) {
			boolean state = utilsControllerService.industryCategoryAdd(industryCategory);
			if (state) {
				String msg = "添加成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "添加失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "参数不能为空！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 职位类别
	 */
	@RequestMapping(value = "/postitonType", method = RequestMethod.GET)
	@ResponseBody
	public Msg postitonType() {
		List<PostitonType> list = utilsControllerService.findPositionAll();
		return Msg.success().add("postitonType", list);
	}

	/**
	 * 联动职位类别
	 */
	@RequestMapping(value = "/postitonTypeOnindustry", method = RequestMethod.GET)
	@ResponseBody
	public Msg postitonTypeOnindustry(Integer id) {
		List<PostitonType> list = utilsControllerService.postitonTypeOnindustry(id);
		if (list == null) {
			String msg = "无记录！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 添加职位类别
	 * 
	 * @param postitonType
	 * @return
	 */
	@RequestMapping(value = "/postitonTypeAdd", method = RequestMethod.GET)
	@ResponseBody
	public Msg postitonTypeAdd(PostitonType postitonType) {
		if (postitonType.getPositionType() != null) {
			boolean state = utilsControllerService.postitonTypeAdd(postitonType);
			if (state) {
				String msg = "添加成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "添加失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "参数不能为空！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除职位类别
	 * 
	 * @param postitonType
	 * @return
	 */
	@RequestMapping(value = "/postitonTypeDrop", method = RequestMethod.GET)
	@ResponseBody
	public Msg postitonTypeDrop(Integer id) {
		boolean state = utilsControllerService.postitonTypeDrop(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 职位名称
	 */
	@RequestMapping(value = "/positionName", method = RequestMethod.GET)
	@ResponseBody
	public Msg positionName() {
		List<PositionName> list = utilsControllerService.positionNameAll();
		return Msg.success().add("positionName", list);
	}

	/**
	 * 添加职位名称
	 * 
	 * @param positionName
	 * @return
	 */
	@RequestMapping(value = "/positionNameAdd", method = RequestMethod.GET)
	@ResponseBody
	public Msg positionNameAdd(PositionName positionName) {
		if (positionName.getPositionName() != null) {
			boolean state = utilsControllerService.positionNameAdd(positionName);
			if (state) {
				String msg = "添加成功！";
				return Msg.success().add("msg", msg);
			} else {
				String msg = "添加失败！";
				return Msg.fail().add("msg", msg);
			}
		} else {
			String msg = "参数不能为空！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除职位名称
	 * 
	 * @param positionName
	 * @return
	 */
	@RequestMapping(value = "/positionNameDrop", method = RequestMethod.GET)
	@ResponseBody
	public Msg positionNameDrop(Integer id) {
		boolean state = utilsControllerService.positionNameDrop(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 获取区
	 */
	@RequestMapping(value = "/getArea", method = RequestMethod.GET)
	@ResponseBody
	public Msg getArea(String id) {
		List<HatArea> list = utilsControllerService.getArea(id);
		if (list == null) {
			String msg = "无记录！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 爬虫数据导入
	 */
	@RequestMapping(value = "/dataBasesTest", method = RequestMethod.GET)
	@ResponseBody
	public Msg dataBasesTest(String urls, String encodings) {
		System.out.println("开始解析");
		List<HashMap<String, String>> list = NetDownUtil.getInfo(urls, encodings);
		System.out.println(list.size());
		PostRelease post = new PostRelease();
		for (HashMap<String, String> hashMap : list) {
			post.setpTyoeTwo(hashMap.get("pTyoeTwo"));
			System.out.println(hashMap.get("pTyoeTwo"));
			System.out.println(hashMap.get("address"));
			post.setpAddress(hashMap.get("address"));
			System.out.println(hashMap.get("sarrys"));
			post.setpMinSalary(hashMap.get("sarrys"));
			System.out.println(hashMap.get("company"));
			post.setcCompanyName(hashMap.get("company"));
			System.out.println(hashMap.get("compantType"));
			System.out.println(hashMap.get("companySize"));
			System.out.println(hashMap.get("instuType"));
			System.out.println(hashMap.get("servers"));
			post.setpServiceLong(hashMap.get("servers"));
			System.out.println(hashMap.get("edu"));
			post.setpEducation(hashMap.get("edu"));
			System.out.println(hashMap.get("size"));
			post.setpSize(hashMap.get("size"));
			System.out.println(hashMap.get("time"));
			post.setpStartTime(hashMap.get("time"));
			System.out.println(hashMap.get("majorOne"));
			post.setpResponsibility(hashMap.get("majorOne"));
			// post.setcCompanyName(hashMap.get("company"));
			// post.setpMaxSalary(hashMap.get("sally"));
			// post.setpStartTime(hashMap.get("date"));
			utilsControllerService.addPost(post);
		}

		return Msg.success().add("lisg", list);
	}

}
