package JavaProgram;

public class CheckPalindrom {

	public static void main(String[] args) {
		String s1 = "madam";
		String revString = "";
		
		for (int i = s1.length()-1; i >= 0; i--) {
			revString = revString + s1.charAt(i);
			
		}
		if (revString.equals(s1)) {
			System.out.println("String is palindrom: " +s1);
		}
		else
			System.out.println("String is not a palindrom: " +s1);

	}

}
