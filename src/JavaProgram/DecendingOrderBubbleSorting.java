package JavaProgram;

public class DecendingOrderBubbleSorting {

	public static void main(String[] args) {
		int arr[] = {10, 2, 12, 32, 7};
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
//This is a nested loop that compares each element arr[j] with the next elements (arr[k]).
		//This pushes larger numbers toward the front, creating a descending order.
		for(int j=0; j<arr.length-1; j++) {
			for(int k=0; k<arr.length-1; k++) {
				if(arr[j] > arr[k+1]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
				
			}
		}
		System.out.println("\nArray after decending order sorting:");
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}	
}


