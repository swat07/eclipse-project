package Assignments;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s1= "swati swara ravi";
		String s2[]= s1.split(" ");
		String revString = "";
		
		for(int i=s2.length-1; i>=0; i--) {
			revString = revString + s2[i] + " ";
			
		}
		System.out.println(revString);
		
	}

}
