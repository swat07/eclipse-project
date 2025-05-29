package JavaProgram;

public class CountNumberOfWord {

	public static void main(String[] args) {
		String words = "One two three four";
		int wordCount = words.split(" ").length;
		System.out.println(wordCount);
		
	}

}
