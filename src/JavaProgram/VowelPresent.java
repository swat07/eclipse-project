package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class VowelPresent {

	public static void main(String[] args) {
		
		HashSet<Character> arrList = new HashSet<>();
//		ArrayList<Character> arrList = new ArayList<>();
//		HashMap<Character,Integer> hm = new HashMap<>();
		
		String s1 = "hyyyewioygeooo".toLowerCase();
		for(int i = 0; i < s1.length(); i++) {
			char ch =s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o'|| ch=='u' || ch=='i') {
				arrList.add(s1.charAt(i));
//				hm.put(ch, 1)
			}
		}
		if(!arrList.isEmpty()) {
			System.out.println("The string contains vowel." +arrList);

		}
		else {
			System.out.println("The String doesnot contain any vowel.");
		}

}
}