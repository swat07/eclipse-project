package JavaProgram;

public class EasyWayRevString {

	public static void main(String[] args) {
		String s1 = "Swati Malviya";
		char s2[] = s1.toCharArray();
		
//		Converts the string into an array of characters.
//
//		Now s2 contains:
//		['S', 'w', 'a', 't', 'i', ' ', 'M', 'a', 'l', 'v', 'i', 'y', 'a']
		
		for(int i= s2.length-1; i>=0; i--) {
			System.out.print(s2[i]);
			
//			Starts from the last character (s2.length - 1) and goes backward to the first.
//
//			Prints each character one by one without a new line.
		}

	}

}
