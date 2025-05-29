package JavaProgram;

public class FindTheLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {78, 45, 10, 96, 100};
		int firstNumb = arr[0];
		for(int i : arr) {
			if (firstNumb < i) {
				firstNumb = i;
			}
		}
		System.out.println(firstNumb);

	}

}
