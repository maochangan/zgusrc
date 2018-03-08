package net.zgysrc.www.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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

import net.zgysrc.www.bean.ArtComment;
import net.zgysrc.www.bean.ArtGallery;
import net.zgysrc.www.bean.ArtPicInfo;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.service.ArtGalleryService;
import net.zgysrc.www.utils.Configuration;
import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "artGalleryController")
@Controller
public class ArtGalleryController {

	@Autowired
	private ArtGalleryService artGalleryService;

	/**
	 * 页数 美术馆大类 TODO
	 * 
	 * @param pn
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtGallery", method = RequestMethod.GET)
	public Msg getAllArtGallery(Integer pn) {
		PageHelper.startPage(pn, 9);
		List<ArtGallery> list = artGalleryService.getAllArtGallery();
		if (list == null) {
			String msg = "无美术馆信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<ArtGallery> pageinfo = new PageInfo<ArtGallery>(list);
			return Msg.success().add("pageinfo", pageinfo);
		}
	}

	/**
	 * 美术馆全部 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtGalleryListAdmin", method = RequestMethod.GET)
	public Msg getAllArtGalleryListAdmin(Integer pn, Integer pSize, String artGalleryName) {
		PageHelper.startPage(pn, pSize);
		List<ArtGallery> list = artGalleryService.getAllArtGalleryListAdmin(artGalleryName);
		if (list == null) {
			String msg = "无美术馆信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<ArtGallery> pageInfo = new PageInfo<ArtGallery>(list);
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * 3个信息 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/getTopArtGallery", method = RequestMethod.GET)
	public Msg getTopArtGallery() {
		List<ArtGallery> list = artGalleryService.getTopArtGallery();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 4个信息 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/getTopTwoArtGallery", method = RequestMethod.GET)
	public Msg getTopTwoArtGallery() {
		List<ArtGallery> list = artGalleryService.getTopTwoArtGallery();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 
	 * 添加美术馆大类 TODO
	 * 
	 * @throws Exception
	 * 
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addArtGallery", method = RequestMethod.POST)
	public Msg addArtGallery(ArtGallery artGallery, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		artGallery.setClick(0);
		String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/art/"
				+ artGallery.getArtGalleryName() + "/" + files.getOriginalFilename();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		files.transferTo(dir);
		String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
				+ request.getServletContext().getContextPath() + "/files/pic/art/" + artGallery.getArtGalleryName()
				+ "/" + files.getOriginalFilename();
		artGallery.setArtGalleryImgPath(dataPath);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String dat = sdf.format(date);
		artGallery.setArtDate(dat);
		ArtGallery ag = artGalleryService.addArtGallery(artGallery);
		if (ag == null) {
			String msg = "此工作室已存在！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("artGallery", ag);
		}
	}

	/**
	 * 
	 * 创建美术馆小类 TODO
	 * 
	 * @throws Exception
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/addArtImgInfo", method = RequestMethod.POST)
	public Msg addArtImgInfo(Integer ids, ArtPicInfo prtPicInfo, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		ArtGallery artGallery = artGalleryService.getArtGalleryById(ids);
		String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/art/"
				+ artGallery.getArtGalleryName() + "/" + prtPicInfo.getPicName() + "/" + files.getOriginalFilename();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		files.transferTo(dir);
		String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
				+ request.getServletContext().getContextPath() + "/files/pic/art/" + artGallery.getArtGalleryName()
				+ "/" + prtPicInfo.getPicName() + "/" + files.getOriginalFilename();
		prtPicInfo.setPicClickNum(0);
		prtPicInfo.setFatherId(ids);
		prtPicInfo.setPicPath(dataPath);
		SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String date = adf.format(new Date());
		prtPicInfo.setPicUploadTime(date);
		prtPicInfo.setPicLikeNum(0);
		if (prtPicInfo.getPicPrize().equals("0")) {
			prtPicInfo.setPicType("非卖品");
			ArtPicInfo aii = artGalleryService.addArtImgInfo(prtPicInfo);
			if (aii == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artImgInfo", aii);
			}
		} else {
			prtPicInfo.setPicType("在售");
			ArtPicInfo aii = artGalleryService.addArtImgInfo(prtPicInfo);
			if (aii == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artImgInfo", aii);
			}
		}
	}

	/**
	 * id 美术馆大类id 获得对应美术馆小类 TODO
	 * 
	 * @throws Exception
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtImgInfo", method = RequestMethod.GET)
	public Msg getAllArtImgInfo(Integer id, Integer pn) {
		ArtGallery artGallery = new ArtGallery();
		artGallery.setId(id);
		ArtGallery artGallerys = artGalleryService.getArtGalleryById(id);
		Integer click = artGallerys.getClick();
		click++;
		artGallery.setClick(click);
		artGalleryService.updateArtGalleryById(artGallery);
		PageHelper.startPage(pn, 16);
		List<ArtPicInfo> list = artGalleryService.getAllArtImgInfoByFatherId(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<ArtPicInfo> pageinfo = new PageInfo<ArtPicInfo>(list);
			return Msg.success().add("pageinfo", pageinfo).add("artGallery", artGallerys);
		}
	}

	/**
	 * id 美术馆大类id 获得对应美术馆小类 TODO
	 * 
	 * @throws Exception
	 *             admin
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtImgInfoListAdmin", method = RequestMethod.GET)
	public Msg getAllArtImgInfoListAdmin(Integer id, Integer pn, Integer pSize, String picName) {
		ArtGallery artGallerys = artGalleryService.getArtGalleryById(id);
		PageHelper.startPage(pn, pSize);
		List<ArtPicInfo> list = artGalleryService.getAllArtImgInfoListAdmin(id, picName);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			PageInfo<ArtPicInfo> pageInfo = new PageInfo<ArtPicInfo>(list);
			return Msg.success().add("pageInfo", pageInfo).add("artGallerys", artGallerys);
		}
	}

	/**
	 * id 美术馆小类id 获得对应美术馆小类 TODO
	 * 
	 * @throws Exception
	 *             admin
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@SuppressWarnings("unused")
	@ResponseBody
	@RequestMapping(value = "/getArtImgInfoAdmin", method = RequestMethod.GET)
	public Msg getArtImgInfoAdmin(Integer id) {
		ArtPicInfo artImgInfo = artGalleryService.getArtImgInfoById(id);
		ArtGallery artGallery = artGalleryService.getArtGalleryById(artImgInfo.getFatherId());
		if (artImgInfo == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("artImgInfo", artImgInfo).add("artGallery", artGallery);
		}
	}

	/**
	 * id 美术馆小类id 获得对应美术馆小类 TODO
	 * 
	 * @throws Exception
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@SuppressWarnings("unused")
	@ResponseBody
	@RequestMapping(value = "/getArtImgInfo", method = RequestMethod.GET)
	public Msg getArtImgInfo(Integer id) {
		ArtPicInfo artImgInfo = artGalleryService.getArtImgInfoById(id);
		ArtGallery artGallery = artGalleryService.getArtGalleryById(artImgInfo.getFatherId());
		if (artImgInfo == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			Integer click = artImgInfo.getPicClickNum();
			ArtPicInfo artImgInfos = new ArtPicInfo();
			artImgInfos.setId(id);
			click++;
			artImgInfos.setPicClickNum(click);
			artGalleryService.updateArtImgInfo(artImgInfos);
			return Msg.success().add("artImgInfo", artImgInfo).add("artGallery", artGallery);
		}
	}

	/**
	 * 修改小类信息 TODO
	 * 
	 * @param id
	 *            小类id
	 * @param artImgInfo
	 * @param files
	 * @param request
	 * @return
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/updateArtImgInfo", method = RequestMethod.POST)
	public Msg updateArtImgInfo(ArtPicInfo artImgInfo, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Exception {
		if (files.getOriginalFilename() == null) {
			ArtPicInfo aii = artGalleryService.updateArtImgInfo(artImgInfo);
			if (aii == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artImgInfo", aii);
			}
		} else {
			ArtGallery artGallery = artGalleryService.getArtGalleryById(artImgInfo.getFatherId());
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/art/"
					+ artGallery.getArtGalleryName() + "/" + artImgInfo.getPicName() + "/"
					+ files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/art/" + artGallery.getArtGalleryName()
					+ "/" + artImgInfo.getPicName() + "/" + files.getOriginalFilename();
			artImgInfo.setPicPath(dataPath);
			ArtPicInfo aii = artGalleryService.updateArtImgInfo(artImgInfo);
			if (aii == null) {
				String msg = "无信息！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artImgInfo", aii);
			}
		}
	}

	/**
	 * 删除美术馆大类 TODO
	 * 
	 * @param artComment
	 * @param id
	 *            大类id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteArtGallery", method = RequestMethod.GET)
	public Msg deleteArtGallery(Integer id) {
		boolean state = artGalleryService.deleteArtGallery(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 删除美术馆小类 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteArtImgInfo", method = RequestMethod.GET)
	public Msg deleteArtImgInfo(Integer id) {
		boolean state = artGalleryService.deleteArtImgInfo(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 创建评论 TODO
	 * 
	 * @param artComment
	 * @param id
	 *            小类id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/addCommentInfo", method = RequestMethod.GET)
	public Msg addCommentInfo(ArtComment artComment, Integer id, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		}
		artComment.setId(null);
		artComment.setFatherId(id);
		artComment.setLikeNum(0);
		artComment.setSimpleUserId(simpleUser.getId());
		artComment.setSimpleUserName(simpleUser.getSimpleName());
		Date date = new Date();
		artComment.setCreateTime(date);
		boolean state = artGalleryService.addCommentInfo(artComment);
		if (state) {
			String msg = "品论成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "失败！";
			return Msg.fail().add("msg", msg);
		}
	}

	/**
	 * 获取品论 TODO
	 * 
	 * @param id
	 *            小类id
	 * @param pn
	 *            页数
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllCommentInfo", method = RequestMethod.GET)
	public Msg getAllCommentInfo(Integer id) {
		List<ArtComment> list = artGalleryService.getAllCommentInfo(id);
		if (list == null) {
			String msg = "无评论信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 评论数量 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/getCommentSize", method = RequestMethod.GET)
	public Msg getAllCommentInfos(Integer id) {
		Integer size = artGalleryService.getCommentSize(id);
		Integer likeSize = artGalleryService.getArtPicLikeSize(id);
		if (size == null) {
			String msg = "无评论信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("commentSzie", size).add("likeSize", likeSize);
		}
	}

	/**
	 * 美术馆排行 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/artRankingList", method = RequestMethod.GET)
	public Msg artRankingList() {
		List<ArtPicInfo> list = artGalleryService.artRankingList();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 十条小信息 TODO
	 */
	@ResponseBody
	@RequestMapping(value = "/getTenList", method = RequestMethod.GET)
	public Msg getTenList() {
		List<Map<String, Object>> list = artGalleryService.getTenList();
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}
	// TODO 不使用
	// /////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 美术馆全部
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtGalleryList", method = RequestMethod.GET)
	public Msg getAllArtGalleryList() {
		List<ArtGallery> list = artGalleryService.getAllArtGallery();
		if (list == null) {
			String msg = "无美术馆信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list);
		}
	}

	/**
	 * 点赞美术馆大类
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "/likeArtGallery", method = RequestMethod.GET)
	public Msg likeArtGallery(Integer id, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			ArtGallery artGallery = artGalleryService.getArtGalleryById(id);
			Integer likeNum = artGallery.getLikeNum();
			likeNum++;
			artGallery.setLikeNum(likeNum);
			artGalleryService.updateArtGalleryById(artGallery);
			String msg = "点赞成功！";
			return Msg.success().add("msg", msg);
		}
	}

	/**
	 * id 美术馆大类id 获得对应美术馆小类
	 * 
	 * @throws Exception
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/getAllArtImgInfoList", method = RequestMethod.GET)
	public Msg getAllArtImgInfoList(Integer id) {
		ArtGallery artGallery = new ArtGallery();
		artGallery.setId(id);
		ArtGallery artGallerys = artGalleryService.getArtGalleryById(id);
		Integer click = artGallerys.getClick();
		click++;
		artGallery.setClick(click);
		artGalleryService.updateArtGalleryById(artGallery);
		List<ArtPicInfo> list = artGalleryService.getAllArtImgInfoByFatherId(id);
		if (list == null) {
			String msg = "无信息！";
			return Msg.fail().add("msg", msg);
		} else {
			return Msg.success().add("list", list).add("artGallerys", artGallerys);
		}
	}

	/**
	 * 
	 * 美术馆大类修改
	 * 
	 * @throws Throwable
	 * @throws IllegalStateException
	 */
	@ResponseBody
	@RequestMapping(value = "/updateArtGallery", method = RequestMethod.POST)
	public Msg updateArtGallery(ArtGallery artGallery, MultipartFile files, HttpServletRequest request)
			throws IllegalStateException, Throwable {
		if (files.getOriginalFilename() == null || files.getOriginalFilename() == "") {
			ArtGallery ag = artGalleryService.updateArtGalleryById(artGallery);
			if (ag == null) {
				String msg = "系统异常！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artGallery", ag);
			}
		} else {
			String path = request.getSession().getServletContext().getRealPath("/") + "files/pic/art/"
					+ artGallery.getArtGalleryName() + "/" + files.getOriginalFilename();
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			files.transferTo(dir);
			String dataPath = "http://" + Configuration.IP + ":" + request.getLocalPort()
					+ request.getServletContext().getContextPath() + "/files/pic/art/" + artGallery.getArtGalleryName()
					+ "/" + files.getOriginalFilename();
			artGallery.setArtGalleryImgPath(dataPath);
			ArtGallery ag = artGalleryService.updateArtGalleryById(artGallery);
			if (ag == null) {
				String msg = "系统异常！";
				return Msg.fail().add("msg", msg);
			} else {
				return Msg.success().add("artGallery", ag);
			}
		}
	}

	/**
	 * 小类点赞
	 * 
	 * @param id
	 *            小类id
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/likeArtImgInfo", method = RequestMethod.GET)
	public Msg likeArtImgInfo(Integer id, HttpSession session) {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登入！";
			return Msg.fail().add("msg", msg);
		} else {
			ArtPicInfo artImgInfo = artGalleryService.getArtImgInfoById(id);
			Integer likeNum = artImgInfo.getPicLikeNum();
			likeNum++;
			artImgInfo.setPicClickNum(likeNum);
			artGalleryService.updateArtImgInfo(artImgInfo);
			String msg = "点赞成功！";
			return Msg.success().add("msg", msg);
		}
	}

	/**
	 * 删除品论
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteCommentInfo", method = RequestMethod.GET)
	public Msg deleteCommentInfo(Integer id) {
		boolean state = artGalleryService.deleteCommentInfo(id);
		if (state) {
			String msg = "删除成功！";
			return Msg.success().add("msg", msg);
		} else {
			String msg = "删除失败！";
			return Msg.fail().add("msg", msg);
		}
	}

}
