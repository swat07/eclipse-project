package JavaProgram;

public class CalculateTheSumOfArray {

	public static void main(String[] args) {
		
		int arr[] = {4, 2, 4, 5, 1};
		int sum =0;
		
		for(int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		
		System.out.println(sum);
	}

}
