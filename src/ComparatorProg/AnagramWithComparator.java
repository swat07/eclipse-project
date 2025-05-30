package ComparatorProg;
import java.util.HashMap;
public class AnagramWithComparator {

	public static void main(String[] args) {
		String s1 = "racee".toLowerCase();
		String s2 = "eCrae".toLowerCase();
		
		if(s1.length()==s2.length()) {
			//If the lengths are not equal, the strings cannot be anagrams.
			//No need to continue further in that case.
			//Note: Empty strings with equal length are valid anagrams (like "" and "").
			HashMap<Character,Integer> map1 = convertStringTohashMap(s1); //These lines count the frequency of each character in the string.
			HashMap<Character,Integer> map2 = convertStringTohashMap(s2); //map1 and map2 will contain key-value pairs like {r=1, a=1, c=1, e=2}.
			
			if (map1.equals(map2)) //Equal keys,Equal values (frequencies),Order doesn't matter (good for anagrams)
			    System.out.println("Given strings are anagram...");
			else
			    System.out.println("Given strings are not anagram...");
		}
		else
			System.out.println("Given strings are not anagram...");
	}
	//I am using a HashMap to count how many times each character appears. 
			//If a character is already in the map, I am incrementing the count; otherwise, I add it with count 1.	
	public static HashMap<Character,Integer> convertStringTohashMap(String s1){
		char s2[] = s1.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character ch: s2){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);
			}
		}
		return hm;
	}

}
