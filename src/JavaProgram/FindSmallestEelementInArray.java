package JavaProgram;

public class FindSmallestEelementInArray {

	public static void main(String[] args) {
		int arr[] = {25, 45, 10, 89,5};
		int smallestNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < smallestNum) {
				smallestNum = arr[i];
			}
			
		}
		
		System.out.println(smallestNum);
	}

}
