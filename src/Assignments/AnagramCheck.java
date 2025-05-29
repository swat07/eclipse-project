package Assignments;

public class AnagramCheck {

	public static void main(String[] args) {
		// Write a function that returns true if two strings are anagrams of each other.An anagram means both strings
//		must contain the same characters with the same frequency, just possibly in a different order.
		
		String s1 = "aabaab".toLowerCase();
		String s2 = "abbaaa".toLowerCase();
		boolean anagramFlag = true;
		
		if(s1.length()==s2.length() && !s1.isEmpty()) {
			for(int i = 0; i<s1.length(); i++) {
				if(!s2.contains(Character.toString(s1.charAt(i)))) {
					anagramFlag = false;
					break;
				}
				else {
					s2 = s2.replaceFirst(Character.toString(s1.charAt(i)), "");
				}
				
			}
			if(anagramFlag) {
				System.out.println("Strings are anagram : " +s1);
			}
			else {
				System.out.println("Strings are not anagram: "+s1);
			}
			
		}
		else {
			System.out.println("Given Strings are not an anagram: " +s1);
		}
		
		
		
	}

}

//class Solution {
//    public boolean isAnagram(String s1, String s2) {
//        // String s1 = "aabaab".toLowerCase();
//		// String s2 = "abbaaa".toLowerCase();
//		boolean anagramFlag = true;
//		
//		if(s1.length()==s2.length() && !s1.isEmpty()) {
//			for(int i = 0; i<s1.length(); i++) {
//				if(!s2.contains(Character.toString(s1.charAt(i)))) {
//					anagramFlag = false;
//					break;
//				}
//				else {
//					s2 = s2.replaceFirst(Character.toString(s1.charAt(i)), "");
//				}
//				
//			}
//			return anagramFlag;
//			
//		}
//		else {
//			return false;
//		}
//		
//    }
//}
