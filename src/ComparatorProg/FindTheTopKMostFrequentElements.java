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
		HashMap<Character, Integer> hm = new HashMap<>(); //I am using a HashMap to count how many times each character appears. 
		//If a character is already in the map, I am incrementing the count; otherwise, I add it with count 1.
		for(Character ch: s2){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm); //Calls sortByValue(hm): a method that returns a LinkedHashMap sorted by value in descending order
		Map<Character,Integer> result = new LinkedHashMap<Character, Integer>(sortByValue(hm));
		System.out.println(result);
		for(char ch : result.keySet()) { //Iterates over the keys (characters) of the result map.Since the map is sorted by frequency, the first key is the most frequent character.
			System.out.println("Most frequent character is: " +ch +" and number of frequecny is:" +result.get(ch));
			break; //ensures only the first entry is printed, then exits the loop.
		}

	}
	//This method sorts a HashMap<Character, Integer> by its values in descending order 
	//(i.e., highest frequency first), and returns the result as a LinkedHashMap to maintain the sorted order.
	public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer> hm1)
	{
		List<Map.Entry<Character,Integer>> list = new LinkedList<Map.Entry<Character,Integer>>(hm1.entrySet());
		//Extract all key-value pairs from the original HashMap as a list...Map.Entry represents a key-value pair.We use a LinkedList to allow efficient sorting.

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
