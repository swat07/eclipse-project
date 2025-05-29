package JavaProgram;

import java.util.HashMap;

//Anagram: Two strings are anagrams if they contain 
//the same characters in the same frequency, but possibly in different orders.


public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = "racee".toLowerCase();
		String s2 = "eCrae".toLowerCase();
		
		boolean anagramFlag = true;
		if (s1.length() == s2.length() && s1 != "") {
			
			for (int i=0 ; i<s1.length() ; i++) {
				if (!s2.contains(Character.toString(s1.charAt(i)))) {
					anagramFlag = false;
					break;
				}
			}
			
			if (anagramFlag)
				System.out.println("Given strings are anagram...");
			else
				System.out.println("Given strings are not anagram...");
		}
		else
			System.out.println("Given strings are not anagram...");
		
		
		
		
	}

}
