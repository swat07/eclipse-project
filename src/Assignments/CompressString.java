package Assignments;

public class CompressString {

	public static void main(String[] args) {
		String s1 = "aaaaaaaaaaaabbbcccccdddddeeeeee";
		int counter = 1;
		String result = "";
		int resultFlag = 0;
		char lastChar = ' ';
		
		for(int i=0; i<s1.length(); i=i+resultFlag) {
			lastChar = s1.charAt(i);
			for(int j=i+1; j<s1.length(); j++) {
				if(s1.charAt(i) == s1.charAt(j)) {
					counter= counter+1;
				}
				else {
					resultFlag = counter;  //resultFlag=12,3,5,5,6
					result = result + s1.charAt(i) + counter;
					counter = 1;
					break;
				}
			}
		}
		result = result + lastChar + counter;
		System.out.println(result);

}
}