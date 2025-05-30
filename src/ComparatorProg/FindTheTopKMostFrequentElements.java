package ComparatorProg;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindTheTopKMostFrequentElements {

	public static void main(String[] args) {
		String s1 = "aawweeeeedd";
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
	       System.out.println(hm);
	       Map<Character,Integer> result = new LinkedHashMap<Character, Integer>(sortByValue(hm));
	       System.out.println(result);
	       for(char ch : result.keySet()) {
	    	   System.out.println("Most frequent character is: " +ch +" and no is frequecny is:" +result.get(ch));
	    	   break;
	       }
		
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
