package net.zgysrc.www.utils;

import java.util.Random;



/**
 * 手机验证码生成器
 * @author Administrator
 *
 */
public class GetMobileCode{
	
	public static StringBuffer getCode(){
		int codeCount = 6;
		Random random = new Random();
		StringBuffer randomCode = new StringBuffer();
		char[] codeSequence = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		
		for (int i = 0; i < codeCount; i++) {
			String code = String.valueOf(codeSequence[random.nextInt(codeSequence.length - 1)]);
			randomCode.append(code);
		}
		
		return randomCode;
	}
	
	
	
}
