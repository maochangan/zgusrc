package zgysrc;

public class Testtwo {

	
	
	public static void main(String[] args) throws Exception {
		StringBuffer sbf = new StringBuffer("45646545645645613!4564564654&13213");
		String uid = sbf.substring(sbf.indexOf("!") + 1, sbf.indexOf("&"));
		String test = sbf.substring(sbf.indexOf("&") + 1, sbf.length());
		System.out.println(uid);
		System.out.println(test);
	}
	
}
