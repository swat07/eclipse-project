package JavaProgram;

import java.util.HashMap;
import java.util.Set;

public class FirstNonReapting {

	public static void main(String[] args) {
		String a = "sswwaatjjkooo";
		char a2[] = a.toCharArray();

		HashMap<Character,Integer> hm = new HashMap<>();
		for(Character ch : a2) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		System.out.println("Non-repeating character are : ");
		Set<Character> keys = hm.keySet();
		
		for (char key : keys) {
			if (hm.get(key) == 1) {
				System.out.print(key + " ");
			}
			
		}
	}

}


