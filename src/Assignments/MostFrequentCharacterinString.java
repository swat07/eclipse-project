package Assignments;

import java.util.HashMap;
import java.util.Set;

public class MostFrequentCharacterinString {

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
	       int maxCount = 0;
	       char maxChar = ' ';
	       Set<Character> keys = hm.keySet();
	       for(Character key : keys){
	        if(hm.get(key) > maxCount){
	            maxCount = hm.get(key);
	            maxChar = key;
	        }
	       }
	       System.out.println("Most frequent character is: '"+maxChar+"' occured:  " +maxCount );
	}
		
	

}
