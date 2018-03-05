package net.zgysrc.www.controller;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.service.PostReleaseService;
import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RequestMapping(value = "postReleaseController")
@Controller
public class PostReleaseController {

	@Autowired
	private PostReleaseService postReleaseService;

	/**
	 * 查询企业职位发布信息
	 * 
	 * @param pn
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/postRelease" , method = RequestMethod.GET)
	@ResponseBody
	public Msg postRelease(int pn, Model model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		PageHelper.startPage(pn, 10);
		List<PostRelease> list = postReleaseService.findAll(user.getcName());
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PageInfo pageinfo = new PageInfo(list);
		return Msg.success().add("pageinfo", pageinfo);
	}

	/**
	 * 职位发布成功
	 * 
	 * @param postRelease
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/postReleaseAdd" , method = RequestMethod.GET)
	@ResponseBody
	public Msg postReleaseAdd(PostRelease postRelease, Model model, HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		postRelease.setcUserName(user.getcUserName());
		postRelease.setcCompanyName(user.getcName());
		boolean state = postReleaseService.postReleaseAdd(postRelease);
		if (state) {
			String msg = "职位发布成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "职位发布失败！企业或个人信息未认证";
			return Msg.fail().add("msg", msg);
		}
	}

	/*
	 * @RequestMapping("/postReleaseUpdate")
	 * 
	 * @ResponseBody public Msg postReleaseUpdate(PostRelease postRelease, Model
	 * model) { boolean state =
	 * postReleaseService.postReleaseUpdate(postRelease);
	 * 
	 * return null; }
	 */

	@RequestMapping(value = "/postReleaseOne" , method = RequestMethod.GET)
	@ResponseBody
	public Msg postReleaseOne(Integer id) {
		PostRelease postRelease = postReleaseService.findOne(id);
		if (postRelease != null) {
			return Msg.success().add("postRelease", postRelease);
		} else {
			String msg = "查询失败！不存在";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 查找个人发布职位
	 * 
	 * @param postRelease
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/postReleaseSearchByUser" , method = RequestMethod.GET)
	@ResponseBody
	public Msg postReleaseSearchByUser(PostRelease postRelease, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		CompanyUser user = (CompanyUser) session.getAttribute("user");
		List<PostRelease> list = postReleaseService.postReleaseSearchByUser(user.getcName());
		if (list.size() == 0) {
			String msg = "暂无发布信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

}
