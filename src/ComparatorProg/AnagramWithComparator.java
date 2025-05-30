package ComparatorProg;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AnagramWithComparator {

	public static void main(String[] args) {
		String s1 = "racee".toLowerCase();
		String s2 = "eCrae".toLowerCase();
		
		if(s1.length()==s2.length()) {

			HashMap<Character,Integer> map1 = convertStringTohashMap(s1);
			HashMap<Character,Integer> map2 = convertStringTohashMap(s2);

			Map<Character,Integer> result1 = new LinkedHashMap<Character, Integer>(sortByValue(map1));
			System.out.println(result1);
			Map<Character,Integer> result2 = new LinkedHashMap<Character, Integer>(sortByValue(map2));
			System.out.println(result2);
			if (result1.equals(result2))
				System.out.println("Given strings are anagram...");
			else
				System.out.println("Given strings are not anagram...");
		}
		else
			System.out.println("Given strings are not anagram...");

	}
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


	public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm1)
	{
		List<Map.Entry<Character,Integer>> list = new LinkedList<Map.Entry<Character,Integer>>(hm1.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >(){

			public int compare (Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
		for(Map.Entry<Character, Integer> aa : list) {
			temp.put(aa.getKey(),aa.getValue());
		}

		return temp;
	}
}
