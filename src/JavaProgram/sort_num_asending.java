package JavaProgram;

public class sort_num_asending {

	public static void main(String[] args) {
		int arr[] = {10, 2, 12, 32, 7};
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
				
			}
		}
		System.out.println("\nArray after ascending:");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}	
}

