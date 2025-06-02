package Assignments;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,8};
		int b[] = {2,4,7,8,10,14};
//o/p:-1 2 2 3 4 5 7 8 8 10 14 		
		int arr[] = new int[a.length + b.length];
		
		for (int i=0; i<a.length ; i++) {
			arr[i] = a[i];
		}
		
		int counter = 0;
		for (int i=a.length ; i< arr.length ; i++) {
			arr[i] = b[counter];
			counter++;
		}
		
//		for (int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
			
		int temp = 0;
		for(int k=0; k<arr.length; k++) {
			for(int j=k+1; j<arr.length;j++) {
				if(arr[k] > arr[j] ) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
			
			}
		for(int i1=0; i1<arr.length; i1++) {
			System.out.print(arr[i1] +" ");
		
			
		}
	}

}
