package net.zgysrc.www.controller.simcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.zgysrc.www.bean.DeanInfo;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.service.PostReleaseService;
import net.zgysrc.www.service.simservice.RecruitmentSpecialService;
import net.zgysrc.www.service.simservice.SimpleUserService;
import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "recruitmentSpecialController")
@Controller
public class RecruitmentSpecialController {

	@Autowired
	private RecruitmentSpecialService recruitmentSpecialService;
	@Autowired
	private SimpleUserService simpleUserService;
	@Autowired
	private PostReleaseService postReleaseService;

	/**
	 * 招聘专场 TODO
	 * 
	 * @param pn
	 * @return
	 */
	@RequestMapping(value = "/getAllListRecruitmentSpecial", method = RequestMethod.GET)
	@ResponseBody
	public Msg theHotCompanyInfo(Integer pn) {
		PageHelper.startPage(pn, 20);
		List<Map<String, Object>> list = simpleUserService.theHotCompanyInfoZhaoping();
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
						list.get(i).put("size", list3.size());
					}
				} else {
					String msg = "无企业发布职位信息！";
					list.get(i).put("msg", msg);
				}
			}
			PageInfo<Map<String, Object>> pageinfo = new PageInfo<Map<String, Object>>(list);
			return Msg.success().add("list", pageinfo);
		}
	}

	/**
	 * 校园招聘 TODO
	 */
	@RequestMapping(value = "/getAllListSchoolpecial", method = RequestMethod.GET)
	@ResponseBody
	public Msg getAllListSchoolpecial(Integer pn) {
		PageHelper.startPage(pn, 20);
		List<Map<String, Object>> list = simpleUserService.theHotCompanyInfoSchool();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).put("findName", "校园招聘");
			}
			PageInfo<Map<String, Object>> pageinfo = new PageInfo<Map<String, Object>>(list);
			return Msg.success().add("list", pageinfo);
		}
	}

	/**
	 * 院长介绍 TODO
	 */
	@RequestMapping(value = "/deanInfoAll", method = RequestMethod.GET)
	@ResponseBody
	public Msg deanInfoAll() {
		List<DeanInfo> list = recruitmentSpecialService.deanInfoAll();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 院长详情 TODO
	 */
	@RequestMapping(value = "/getDeanInfo", method = RequestMethod.GET)
	@ResponseBody
	public Msg deanInfoAll(Integer id) {
		DeanInfo deanInfo = recruitmentSpecialService.getDeanInfo(id);
		if (deanInfo == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer num = deanInfo.getClickNum() + 1;
			deanInfo.setClickNum(num);
			recruitmentSpecialService.updateDeanInfo(deanInfo);
			return Msg.success().add("deanInfo", deanInfo);
		}
	}

	// TODO
	// 不使用///////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 校园招聘 不使用
	 */
	@RequestMapping(value = "/campusRecruitment", method = RequestMethod.GET)
	@ResponseBody
	public Msg campusRecruitment(PostRelease postRelease) {
		postRelease.setCampusRecruitment("校招");
		List<Map<String, Object>> list = recruitmentSpecialService.getAllListRecruitmentSpecial(postRelease);
		if (list == null) {
			String msg = "暂无校园招聘信息！";
			return Msg.fail().add("msg", msg);
		} else {
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if ((list.get(j).get("cId")) == (list.get(i).get("cId"))) {
						list.remove(j);
					}
				}
			}
			return Msg.success().add("list", list);
		}
	}

}
