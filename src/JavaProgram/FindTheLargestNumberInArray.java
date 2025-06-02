package JavaProgram;

public class FindTheLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {78, 45, 101, 96, 100};
		int finalNum = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > finalNum) {
				finalNum = arr[i];
			}
		}
		
		System.out.println(finalNum);

	}

}
