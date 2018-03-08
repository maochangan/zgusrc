package zgysrc;

import java.util.ArrayList;
import java.util.List;

public class Testtwo {

	public static void main(String[] args) throws Exception {
		List<Integer> ida = new ArrayList<Integer>();
		StringBuffer sbf = new StringBuffer("4");
		String a = sbf.toString();
		String[] b = a.split(",");
		for (int i = 0; i < b.length; i++) {
			Integer id = Integer.valueOf(b[i]);
			System.out.println(id);
			ida.add(id);
		}
		System.out.println(ida.get(0)+":"+ida.get(1));
	}

}
