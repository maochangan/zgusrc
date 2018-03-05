package net.zgysrc.www.utils;

public class UtilStringBufferToString {
	public static String stringBufferToString(String string){
		StringBuffer sb = new StringBuffer(string);
		StringBuffer sbc = new StringBuffer();
		for(int i = 0 ; i < sb.length() ; i++ ){
			char s = sb.charAt(i);
			sbc.append("%"+s);
		}
		sbc.append("%");
		return sbc.toString();
	}
}
