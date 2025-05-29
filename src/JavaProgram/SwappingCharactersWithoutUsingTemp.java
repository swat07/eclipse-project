package JavaProgram;

public class SwappingCharactersWithoutUsingTemp {

	public static void main(String[] args) {
		String a = "Swati";
		String b = "Swara";
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swap: " +a);
		System.out.println("After Swap: " +b);

	}
}
