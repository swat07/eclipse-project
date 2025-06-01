package JavaProgram;

import java.util.HashMap;

public class CountCharacterOccurrences {

	public static void main(String[] args) {
//Input string whose characters' frequencies you want to count		
		String s1 = "sstryyi";
//s1.toCharArray();	Converts the string to a character array so you can loop over each character.
		char s2[] = s1.toCharArray();
//new HashMap<>();	Creates a HashMap to store each character as a key and its frequency as the value		
		HashMap<Character,Integer> hm = new HashMap<>();
//Loops through each character in the char array		
		for(Character ch : s2) {
//Checks if the character is already in the map
			if(hm.containsKey(ch)) {
//If yes, increments its count by 1
				hm.put(ch, hm.get(ch)+1);
			}
			else {
//If not, puts the character in the map with count 1
				hm.put(ch, 1);
			}
		}
		System.err.println(hm);
		
	}

}

