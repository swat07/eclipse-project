package Assignments;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
//		Implement a sliding window approach to return the length of the longest such substring.
		
		String s1 = "swaatrsviar";
		
		ArrayList<ArrayList<Character>> finalList = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> arrList = new ArrayList<>();
		
		for(int i=0; i<s1.length();i++) {
			if (!arrList.contains(s1.charAt(i))){
				arrList.add(s1.charAt(i));
			}
			else {
				finalList.add(arrList);
				arrList = new ArrayList<Character>();
				arrList.add(s1.charAt(i));
			}
		}
		finalList.add(arrList);
		System.out.println(finalList);
		
		int maxLen = 0;
		for (ArrayList<Character> str : finalList) {
			if (str.size() > maxLen) {
				maxLen = str.size();
			}
		}
		
		System.out.println("Length of largest substring is : " + maxLen);
	}

}
