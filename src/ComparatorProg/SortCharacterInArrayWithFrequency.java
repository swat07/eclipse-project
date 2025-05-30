package ComparatorProg;

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
//I use a HashMap to count how many times each character appears. 
//If a character is already in the map, I increment the count; otherwise, I add it with count 1.
		HashMap<Character,Integer> hm = new HashMap<>();
		for(Character ch : s2) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1); //This line increments the value (count) associated with the character ch in the HashMap hm.
			}
			else {
				hm.put(ch, 1);
			}
		}
		
//	TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>(hm);
//System.out.println(tm); //with key sorting
		
//Since HashMap doesn't maintain order, I create a helper method sortByValue() which:
		
		HashMap<Character, Integer> sortedMap = sortByValue(hm);
		System.out.println(hm);
		System.out.println(sortedMap);
		
		String result = "";
//After sorting, I iterate over the map and construct a new 
//string by appending each character n times (based on its frequency).
//The characters are sorted by frequency: r (5), e (3), t (2)
		for (char key : sortedMap.keySet()) { 
//returns a set of characters that were stored as keys in the LinkedHashMap.This loop goes through each character (key) one by one.
			int val = sortedMap.get(key); 
//For each character (key), sortedMap.get(key) returns its frequency count.
//First iteration: key = 'r', val = 5
			for (int i=0 ; i<val ; i++) {
				result = result + key; //So the final result string becomes: "rrrrreeett"
			}
		}
		
		System.out.println(result);
		
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
				return (o2.getValue()).compareTo(o1.getValue());  //o2.getValue().compareTo(o1.getValue()) ensures higher frequency comes first.
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
