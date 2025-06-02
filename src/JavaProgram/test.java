package JavaProgram;

public class test {

	public static void main(String[] args) {
		
		String s1 = "This is my first code";
		String s2 [] = s1.split(" ");
		for(int i =0; i<s2.length; i++) {
			
			char ch[] = s2[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--) {
				System.out.print(ch[j]);
				
			}
			System.out.print(" ");
		}
	}

}
