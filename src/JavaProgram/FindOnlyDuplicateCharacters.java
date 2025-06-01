package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class FindOnlyDuplicateCharacters {

	public static void main(String[] args) {
		
		String s1 = "swwattieerss";
		char s2[] =s1.toCharArray();
		
		HashSet<Character> hs1 = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<>();
		
		for(int i = 0; i<s2.length; i++) {
			if(!hs1.contains(s2[i])) {
				hs1.add(s2[i]);
			}
			else {
				hs2.add(s2[i]);
			}
		}
		System.out.println("Duplicate characters are: " +hs2);
		System.out.println("After removing dupliucate characters value is :" +hs1);
		
		
		
	}
}
		
		
////ArrayList Will store duplicate characters (but only once).		
//		ArrayList<Character> arrList = new ArrayList<>();
////hm,Used to track occurrence of each character.
//		HashMap<Character, Integer> hm = new HashMap<>();
//		
//		for(int i=0; i<s1.length(); i++) {
//			char key = s1.charAt(i);
//			
//			if(!hm.containsKey(key)) {
//				hm.put(key, 1);
//			}
//			else {
//				if(!arrList.contains(key))
//					arrList.add(key);
////If the character is already in the map, 
////and it’s not yet added to arrList, add it as a duplicate.
//			}
//	}
//		System.out.print("Duplicate characters are: " +arrList);
//
//}
//}
////Purpose of ArrayList in the code:
////The HashMap<Character, Integer> is used to track if a character has appeared.
////But HashMap does not track order or guarantee that duplicates are listed only once.
////So we use an ArrayList to:
////✅ Collect only the first time a character is found to be a duplicate.
////✅ Ensure each duplicate character appears once in the output.
////✅ Preserve the order in which duplicates were found.

