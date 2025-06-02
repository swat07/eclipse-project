package Assignments;

import java.util.ArrayList;

public class StringPatternMatching {
	
	public static ArrayList<String> findSubStrings(String source, String pattern){
		
		ArrayList<String> subStrings = new ArrayList<>();
		
		for(int i=0; i<source.length();i++) {
			String subString = "";
			for(int j=i; j<source.length(); j++) {
				subString = subString + source.charAt(j);
				
				if (subString.length() == pattern.length())
					subStrings.add(subString);
			}
		}
		System.out.println(subStrings);
		return subStrings;
	}
	public static boolean isVowel(char ch) {
		return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
	}
	public static void main(String[] args) {
		
		String source = "amazing";
		String pattern = "010";
		ArrayList<String> subStrings = findSubStrings(source, pattern);
		ArrayList<String> matched = new ArrayList<>();
		
		for(String sub : subStrings) {
			
			boolean vowelFlag = true;
			for (int i = 0; i < pattern.length(); i++) {
				char ch = sub.charAt(i);
				if ((pattern.charAt(i) == '0' && !isVowel(ch)) || 
				    (pattern.charAt(i) == '1' && isVowel(ch))) {
					vowelFlag = false;
					break;
				}
			}
			if (vowelFlag) {
				matched.add(sub);
			}
		}

		System.out.println("Matching substrings: " + matched);
			
		}
	}

