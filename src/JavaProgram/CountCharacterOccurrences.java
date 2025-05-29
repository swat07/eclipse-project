package JavaProgram;

import java.util.HashMap;

public class CountCharacterOccurrences {

	public static void main(String[] args) {
		
		String s1 = "sstryyi";
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
		System.err.println(hm);
		
	}

}

//Line	What It Does
//String s1 = "ttrryyumhs";	Input string whose characters' frequencies you want to count
//char s2[] = s1.toCharArray();	Converts the string to a character array so you can loop over each character
//HashMap<Character, Integer> hm = new HashMap<>();	Creates a HashMap to store each character as a key and its frequency as the value
//for (Character ch : s2)	Loops through each character in the char array
//if (hm.containsKey(ch))	Checks if the character is already in the map
//hm.put(ch, hm.get(ch) + 1);	If yes, increments its count by 1
//else { hm.put(ch, 1); }	If not, puts the character in the map with count 1

