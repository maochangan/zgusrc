package net.zgysrc.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import net.zgysrc.www.utils.Msg;

@CrossOrigin(origins = "*" , maxAge = 3600)
@Controller
@RequestMapping(value = "wxPayContriller")
public class WXPayController {
	
	@ResponseBody
	@RequestMapping(value = "wxGotoPay" , method = RequestMethod.POST)
	public Msg wxGotoPay(){
		
		
		
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "getUrlCode" , method = RequestMethod.POST)
	public Msg getUrlCode(){
		
		
		
		
		return Msg.success().add("", "");
	}

}
