package net.zgysrc.www.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

import net.zgysrc.www.bean.ArtPicInfo;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.PicPayInfo;
import net.zgysrc.www.bean.SimplePrice;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.bean.UserReceivingAddress;
import net.zgysrc.www.service.AdminService;
import net.zgysrc.www.service.ArtGalleryService;
import net.zgysrc.www.service.CompanyUserService;
import net.zgysrc.www.service.simservice.SimpleUserService;
import net.zgysrc.www.utils.AlipayConfig;
import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "alipayController")
@Controller
public class AlipayController {

	@Autowired
	private ArtGalleryService artGalleryService;
	@Autowired
	private SimpleUserService simpleUserService;
	@Autowired
	private AdminService adminService;
	@Autowired
	private CompanyUserService companyUserService;

	/**
	 * 
	 * 支付请求 美术馆
	 * 
	 * @param model
	 * @param price
	 * @param tName
	 * @param business
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "gotoPay", method = RequestMethod.POST)
	public Msg gotoPay(UserReceivingAddress userReceivingAddress, Integer ids, HttpServletResponse response,
			HttpSession session) throws Exception {
		SimpleUser simpleUser = (SimpleUser) session.getAttribute("simpleUser");
		if (simpleUser == null) {
			String msg = "请登录！";
			return Msg.fail().add("msg", msg);
		}
		userReceivingAddress.setUserId(simpleUser.getId());
		userReceivingAddress.setGoodsId(ids);
		ArtPicInfo artPicInfo = artGalleryService.getArtImgInfoById(ids);
		if (artPicInfo == null) {
			String msg = "无产品信息！";
			return Msg.fail().add("msg", msg);
		} else {
			String price = artPicInfo.getPicPrize();
			String tName = artPicInfo.getPicName();
			String picInfo = artPicInfo.getPicDescribe();
			if (artPicInfo.getPicType().equals("非卖品")) {
				String msg = "不可出售！";
				return Msg.fail().add("msg", msg);
			} else if (artPicInfo.getPicLikeNum().equals(2)) {
				String msg = "已出售！";
				return Msg.fail().add("msg", msg);
			} else {
				simpleUserService.addUserReceivingAddress(userReceivingAddress);
				AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
						AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
						AlipayConfig.sign_type);
				// 设置请求参数
				AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
				alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
				alipayRequest.setReturnUrl(AlipayConfig.return_url);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
				// 商户订单号，商户网站订单系统中唯一订单号，必填
				String out_trade_no = sdf.format(new Date()) + "?" + ids + "!" + 1;
				// String out_trade_no = sdf.format(new Date()) + "?" + id + "!"
				// + simpleUser.getId();
				// 付款金额，必填
				String total_amount = price.replace(",", "");
				alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\""
						+ total_amount + "\"," + "\"subject\":\"" + tName + "\"," + "\"body\":\"" + picInfo + "\","
						+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
				// 请求
				String result = alipayClient.pageExecute(alipayRequest).getBody();
				AlipayConfig.logResult(result);// 记录支付日志
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.print(result);
				return null;
			}
		}
	}

	/**
	 * p2p后台返回的操作
	 * 
	 * @param response，request
	 * @throws Exception
	 * @return void
	 */
	@ResponseBody
	@RequestMapping(value = "notify_url", method = RequestMethod.POST)
	public Msg Notify(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		StringBuffer sb = new StringBuffer(out_trade_no);
		String ids = sb.substring(sb.indexOf("?") + 1, sb.indexOf("!"));
		Integer id = Integer.valueOf(ids);
		String uid = sb.substring(sb.indexOf("!") + 1, sb.length());
		Integer userId = Integer.valueOf(uid);
		ArtPicInfo artPicInfo = artGalleryService.getArtImgInfoById(id);
		// 付款金额
		String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "utf-8");
		// 支付宝交易号
		String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "utf-8");
		// 交易说明
		String cus = new String(request.getParameter("body").getBytes("ISO-8859-1"), "utf-8");
		// 交易状态
		String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "utf-8");

		PicPayInfo picPayInfo = new PicPayInfo();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String createDate = sdf.format(date);
		picPayInfo.setCreateDate(createDate);
		picPayInfo.setCus(cus);
		picPayInfo.setGoodsId(id);
		picPayInfo.setUserId(userId);
		picPayInfo.setPrice(total_amount);
		picPayInfo.setOutTradeNo(out_trade_no);
		picPayInfo.setTradeNo(trade_no);

		if (trade_status.equals("TRADE_SUCCESS")) {// 支付成功商家操作
			picPayInfo.setTradeStatus(trade_status);
			adminService.updatePicPayInfo(picPayInfo);
			artPicInfo.setBuyUserName(trade_no);
			artPicInfo.setSellOrNot("sell");
			artPicInfo.setBuyUserId(userId);
			artPicInfo.setPicPrize(total_amount);
			artGalleryService.updateArtImgInfo(artPicInfo);
			return Msg.success().add("msg", cus);
		} else {
			picPayInfo.setTradeStatus(trade_status);
			adminService.updatePicPayInfo(picPayInfo);

			String msg = "失败！";
			return Msg.fail().add("e", e.toString()).add("msg", msg);
		}
	}

	/**
	 * 
	 * @param response
	 * @param request
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "return_url", method = RequestMethod.GET)
	public Msg Return(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		Map<String, String> map = new HashMap<String, String>();
		map.put("单号", out_trade_no);
		map.put("out_trade_no", out_trade_no);
		String msg = "付款成功！请到用户中心查看订单信息！";
		return Msg.success().add("msg", msg).add("map", map);
	}

	/**
	 * 
	 * 包月支付请求
	 * 
	 * @param model
	 * @param price
	 * @param tName
	 * @param business
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "gotoPayVip", method = RequestMethod.POST)
	public Msg gotoPayVip(HttpServletResponse response, HttpSession session) throws Exception {
		List<SimplePrice> list = adminService.getSimpelVipInfo();
		String price = null;
		String tName = null;
		String picInfo = null;
		if (list == null) {
			price = "30";
			tName = "艺术人才网图书馆VIP会员";
			picInfo = "艺术人才网图书馆VIP会员 ￥30/月";
		} else {
			price = list.get(0).getSimpleVipPrice();
			tName = "艺术人才网图书馆VIP会员";
			picInfo = "艺术人才网图书馆VIP会员 ￥" + price + "/月";
		}
		// SimpleUser simpleUser = (SimpleUser)
		// session.getAttribute("spriceimpleUser");

		SimpleUser simpleUser = new SimpleUser();
		simpleUser.setId(1);
		// if (simpleUser == null) {
		// String msg = "请登录！";
		// return Msg.fail().add("msg", msg);
		// }
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);
		// 设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setNotifyUrl(AlipayConfig.vip_notify_url);
		alipayRequest.setReturnUrl(AlipayConfig.vip_return_url);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		// 商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = sdf.format(new Date()) + "!" + simpleUser.getId();
		// 付款金额，必填
		String total_amount = price.replace(",", "");
		alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + tName + "\"," + "\"body\":\"" + picInfo + "\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		AlipayConfig.logResult(result);// 记录支付日志
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		return null;
	}

	/**
	 * p2p后台返回的操作
	 * 
	 * @param response，request
	 * @throws Exception
	 * @return void
	 */
	@ResponseBody
	@RequestMapping(value = "vip_notify_url", method = RequestMethod.POST)
	public Msg vipNotify(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		StringBuffer sb = new StringBuffer(out_trade_no);
		String uid = sb.substring(sb.indexOf("!") + 1, sb.length());
		Integer userId = Integer.valueOf(uid);
		// 付款金额
		// String total_amount = new
		// String(request.getParameter("total_amount").getBytes("ISO-8859-1"),
		// "utf-8");
		// 支付宝交易号
		// String trade_no = new
		// String(request.getParameter("trade_no").getBytes("ISO-8859-1"),
		// "utf-8");
		// 交易说明
		String cus = new String(request.getParameter("body").getBytes("ISO-8859-1"), "utf-8");
		// 交易状态
		String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "utf-8");
		if (trade_status.equals("TRADE_SUCCESS")) {// 支付成功商家操作
			simpleUserService.updateSimpleUserVip(userId);
			return Msg.success().add("msg", cus);
		} else {
			String msg = "失败！";
			return Msg.fail().add("e", e.toString()).add("msg", msg);
		}
	}

	/**
	 * 
	 * @param response
	 * @param request
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "vip_return_url", method = RequestMethod.GET)
	public Msg vipReturn(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		Map<String, String> map = new HashMap<String, String>();
		map.put("单号", out_trade_no);
		map.put("out_trade_no", out_trade_no);
		String msg = "付款成功！请联系商家确定个人信息！";
		return Msg.success().add("msg", msg).add("map", map);
	}

	/**
	 * 企业vip支付请求
	 * 
	 */
	@ResponseBody
	@RequestMapping(value = "gotoPayCompanyVip", method = RequestMethod.POST)
	public Msg gotoPayCompanyVip(Integer id, String companyVipType, HttpServletResponse response, HttpSession session)
			throws Exception {
		CompanyVip companyVip = adminService.getCompanyPriceType(companyVipType);
		if (companyVip == null) {
			return Msg.fail().add("msg", "系统异常！请稍后再试！");
		} else {
			CompanyUser companyUser = (CompanyUser) session.getAttribute("user");
			if (companyUser == null) {
				String msg = "请登录！";
				return Msg.fail().add("msg", msg);
			}
			String price = companyVip.getCompanyVipPrice();
			String tName = "艺术人才网企业VIP会员";
			String picInfo = "艺术人才网企业VIP会员 ￥" + price + "/月";

			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
					AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
					AlipayConfig.sign_type);
			// 设置请求参数
			AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
			alipayRequest.setNotifyUrl(AlipayConfig.vip_notify_url_com);
			alipayRequest.setReturnUrl(AlipayConfig.vip_return_url_com);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			// 商户订单号，商户网站订单系统中唯一订单号，必填
			String out_trade_no = sdf.format(new Date()) + "!" + companyUser.getId() + "&" + price;
			// 付款金额，必填
			String total_amount = price.replace(",", "");
			alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\""
					+ total_amount + "\"," + "\"subject\":\"" + tName + "\"," + "\"body\":\"" + picInfo + "\","
					+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
			// 请求
			String result = alipayClient.pageExecute(alipayRequest).getBody();
			AlipayConfig.logResult(result);// 记录支付日志
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print(result);
			return null;
		}

	}

	/**
	 * p2p后台返回的操作 企业vip
	 * 
	 * @param response，request
	 * @throws Exception
	 * @return void
	 */
	@ResponseBody
	@RequestMapping(value = "vip_notify_url_com", method = RequestMethod.POST)
	public Msg vipNotifyUrlCom(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		StringBuffer sb = new StringBuffer(out_trade_no);
		String uid = sb.substring(sb.indexOf("!") + 1, sb.indexOf("&"));
		Integer userId = Integer.valueOf(uid);
		String vipPrice = sb.substring(sb.indexOf("&") + 1, sb.length());
		CompanyVip companyVip = adminService.getCompanyPricePrice(vipPrice);
		// 付款金额
		// String total_amount = new
		// String(request.getParameter("total_amount").getBytes("ISO-8859-1"),
		// "utf-8");
		// 支付宝交易号
		// String trade_no = new
		// String(request.getParameter("trade_no").getBytes("ISO-8859-1"),
		// "utf-8");
		// 交易说明
		String cus = new String(request.getParameter("body").getBytes("ISO-8859-1"), "utf-8");
		// 交易状态
		String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "utf-8");
		if (trade_status.equals("TRADE_SUCCESS")) {// 支付成功商家操作
			companyUserService.updateCompanyInfo(userId, companyVip);
			return Msg.success().add("msg", cus);
		} else {
			String msg = "失败！";
			return Msg.fail().add("e", e.toString()).add("msg", msg);
		}
	}

	/**
	 * 
	 * @param response
	 * @param request
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "vip_return_url_com", method = RequestMethod.GET)
	public Msg vipReturnUrlCom(HttpServletResponse response, HttpServletRequest request, Exception e) throws Exception {
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
		Map<String, String> map = new HashMap<String, String>();
		map.put("单号", out_trade_no);
		map.put("out_trade_no", out_trade_no);
		String msg = "付款成功！请联系商家确定个人信息！";
		return Msg.success().add("msg", msg).add("map", map);
	}

}
