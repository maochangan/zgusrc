package zgysrc;

import org.junit.Test;

public class Testtwo {

	public static void main(String[] args) throws Exception {
		String as = "11,11,11,11";
		StringBuffer sbf = new StringBuffer();
		for(int i = 0 ; i < 4 ; i ++){
			sbf.append(as.split(",")[i]);
			sbf.append("，");
		}
		sbf.delete(sbf.length()-1, sbf.length());
	}
	
	@Test
	public void test(){
		
		System.out.println(111);
		
	}

}
