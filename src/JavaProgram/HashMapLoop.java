package JavaProgram;

import java.util.HashMap;

public class HashMapLoop {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("Swati", "20");
		hm.put("Ravi", "30");
		hm.put("Swara","2");
		System.out.println(hm);
		for(String i : hm.values()) {
			System.out.println("hashMap Values: " +i);
			
		}
		for(String j : hm.keySet()) {
			System.out.println("HashMap keys: " +j);
		}
		

	}

}
