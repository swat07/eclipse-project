package Assignments;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortCharacterInArrayWithFrequency {

	public static void main(String[] args) {

		String s1 = "treeetrrrr"; // rrrrreeett
		char s2[] = s1.toCharArray();

		HashMap<Character,Integer> hm = new HashMap<>();
		for(Character ch : s2) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
//		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(hm);
//		System.out.println(tm); //with key sorting
		
		
		HashMap<Character, Integer> sortedMap = sortByValue(hm);
		System.out.println(hm);
		System.out.println(sortedMap);
		
		String result = "";
		
		for (char key : sortedMap.keySet()) {
			int val = sortedMap.get(key);
			
			for (int i=0 ; i<val ; i++) {
				result = result + key;
			}
		}
		
		System.out.println(result);
		
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
