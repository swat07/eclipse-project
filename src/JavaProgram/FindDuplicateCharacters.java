package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String s1 = "swwattieerss";
		ArrayList<Character> arrList = new ArrayList<>();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<s1.length(); i++) {
			char key = s1.charAt(i);
			if(!hm.containsKey(key)) {
				hm.put(key, 1);
			}
			else {
				if(!arrList.contains(key))
					arrList.add(key);
			}
	}
		System.out.print("Duplicate characters are: " +arrList);

}
}
