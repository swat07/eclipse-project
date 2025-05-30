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
		HashMap<Character,Integer> hm = convertStringTohashMap(s1); //This line builds a frequency map from the input string s1.hm stores each character as a key and how many times it appears as the value.
		hm = sortByValue(hm); //This sorts the map in descending order of character frequency using a helper method.A LinkedHashMap is returned to preserve the sorted order.
		System.out.println(hm);
		int val = 0;
		for(char key : hm.keySet()) { //Purpose: To get the maximum frequency from the first character in the sorted map.Since it's sorted by value, the first key has the highest frequency.
			val = hm.get(key);
			break;
		}
		for(int i=0; i<val; i++) { //This is the core logic to build the result string. The outer loop runs val times (max frequency).
			for(char key : hm.keySet()) {  //The inner loop goes over each key in the map.
				if(hm.get(key) > 0) {   //If the frequency of a character is still greater than 0, it: Appends the character to the result.Decreases its frequency by 1 in the map.
					result = result + key; 
					hm.put(key, hm.get(key)-1); //{s=3-1, w=3-1, r=2-1, t=1-1, e=1-1}
				}
			}
		}
		System.out.println(result);
	}

	//I am using a HashMap to count how many times each character appears. If a character is already in the map, I am incrementing the count; otherwise, I add it with count 1.
	
	public static HashMap<Character,Integer> convertStringTohashMap(String s1){
		char s2[] = s1.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character ch: s2){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1); //This line increments the value (count) associated with the character ch in the HashMap hm.
			}
			else{
				hm.put(ch, 1);
			}
		}
		return hm;
	}
//This method sorts a HashMap<Character, Integer> by its values in descending order 
//(i.e., highest frequency first), and returns the result as a LinkedHashMap to maintain the sorted order.
		public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm1)
		{
			List<Map.Entry<Character,Integer>> list = new LinkedList<Map.Entry<Character,Integer>>(hm1.entrySet());
//Extract all key-value pairs from the original HashMap as a list...
//Map.Entry represents a key-value pair.We use a LinkedList to allow efficient sorting.
			
			Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >(){
//Sort the list using Collections.sort()...A custom comparator is used to sort by value in descending order..
//This is an anonymous class implementing Comparator to define custom sorting logic.
				public int compare (Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
					return (o2.getValue()).compareTo(o1.getValue());  
//o2.getValue().compareTo(o1.getValue()) ensures higher frequency comes first.
				}
			});
//We use a LinkedHashMap to store the sorted entries.LinkedHashMap maintains insertion order, so the final map keeps the sorted order.
			HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
			for(Map.Entry<Character, Integer> aa : list) { //Iterate through the sorted list and populate the LinkedHashMap.
				temp.put(aa.getKey(),aa.getValue());
			}
			
			return temp; //Return the sorted map.
	}

}


