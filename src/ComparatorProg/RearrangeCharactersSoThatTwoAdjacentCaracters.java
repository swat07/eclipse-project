package ComparatorProg;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RearrangeCharactersSoThatTwoAdjacentCaracters {

	public static void main(String[] args) {
		String s1 = "sswtrersww";
		String result = "";

		//		s=3 , w=3, r=2, t=1 , e=1
		//		swrteswrsw 
		HashMap<Character,Integer> hm = convertStringTohashMap(s1);
		hm = sortByValue(hm);
		System.out.println(hm);
		int val = 0;
		for(char key : hm.keySet()) {
			val = hm.get(key);
			break;
		}
		for(int i=0; i<val; i++) {
			for(char key : hm.keySet()) {
				if(hm.get(key) > 0) {
					result = result + key; 
					hm.put(key, hm.get(key)-1); //{s=3-1, w=3-1, r=2-1, t=1-1, e=1-1}
				}
			}
		}
		System.out.println(result);
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


