package JavaProgram;

import java.util.HashMap;

public class CountFrequencyofWordsInSentence {

	public static void main(String[] args) {
		
		String s1 = "bob is a boy and and swati is girl";
		String s2[] = s1.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		for(String ch : s2) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		

	}

}
