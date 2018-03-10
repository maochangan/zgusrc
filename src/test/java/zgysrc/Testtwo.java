package zgysrc;

import net.zgysrc.www.utils.UtilsMD5;

public class Testtwo {

	public static void main(String[] args) throws Exception {
		System.out.println(UtilsMD5.md5("123456"));
		String a = "25f9e794323b453885f5181f1b624d0b";
		boolean state = a.equals(UtilsMD5.md5("123456789"));
		System.out.println(state);
		
	}

}
