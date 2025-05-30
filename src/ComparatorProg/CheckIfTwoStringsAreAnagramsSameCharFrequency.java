package ComparatorProg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CheckIfTwoStringsAreAnagramsSameCharFrequency {
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) //Even if strings are empty but 
			//If the lengths are not equal, the strings cannot be anagrams.
			//No need to continue further in that case.
			//Note: Empty strings with equal length are valid anagrams (like "" and "").
		{
			return false;
		}
		//Converting Strings to Lists of Characters,
		//This allows sorting and comparing them more easily.
		
		List<Character>list1 = toCharList(s1);
		List<Character>list2= toCharList(s2);
		
//Declares a comparator that compares characters in natural order (i.e., 'a' < 'b' < 'c'...).
		Comparator<Character> chComp = Comparator.naturalOrder();
		
//These two lines sort the character lists list1 and list2 in natural (alphabetical) 
//2. list1, list2
//These are List<Character> objects created from the input strings.
//Example: "listen" becomes ['l', 'i', 's', 't', 'e', 'n']
//This comparator sorts elements in natural order for characters:'a' < 'b' < 'c' < ... < 'z'
		
		Collections.sort(list1,chComp);  // ['e', 'i', 'l', 'n', 's', 't']
		Collections.sort(list2,chComp); // ['e', 'i', 'l', 'n', 's', 't']
//Returns true if both sorted character lists are equal.		
		return list1.equals(list2); 
		
	}
	//Converts a string into a List<Character>:
	public static List<Character> toCharList(String s){
//List is a Java interface (from java.util package) that represents an ordered collection.
		List<Character> list = new ArrayList<Character>(); //ArrayList is a resizable array implementation of the List interface.
		for(char  ch : s.toCharArray()) {
			list.add(ch); //Then, each character is added to a list one by one.
		}
		return list;
	}

	public static void main(String[] args) {
		//A static method that returns true if s1 and s2 are anagrams, false otherwise.
		System.out.println(isAnagram("listen", "silent"));
		System.out.println(isAnagram("Hello", "silent"));
	}
}
