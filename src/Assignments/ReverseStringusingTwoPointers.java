package Assignments;

public class ReverseStringusingTwoPointers {

	public static void main(String[] args) {
		
		String s1 = "swati";
		String revString = "";
		for(int i = 0; i < s1.length(); i++) {
			revString = s1.charAt(i) + revString;
		}
		System.out.println(revString);

	}

}

//i=0 revString = 's'+"" = "s"
//i=1           = 'w'+"s" = "ws"
