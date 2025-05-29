package JavaProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String originalString = "Swati malviya";
		String reversedString = "";
		
		
		for(int i = 0; i<originalString.length(); i++) {
			reversedString = originalString.charAt(i) + reversedString;
		}
		System.out.println(reversedString);
	}

}

//Initial: reversedString = ""

//i = 0: 'S' + "" = "S"
//
//i = 1: 'w' + "S" = "wS"
//
//i = 2: 'a' + "wS" = "awS"
//
//i = 3: 't' + "awS" = "tawS"
//
//i = 4: 'i' + "tawS" = "itawS"