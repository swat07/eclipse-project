package Test;

import java.util.HashMap;

public class HashMap_Program {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("India", "Pune");
		hm.put("Japan","Tokyo");
		hm.put("England", "London");
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		

	}

}
