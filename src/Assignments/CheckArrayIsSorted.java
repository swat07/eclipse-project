package Assignments;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,6,6,9,20};
		boolean arrayCheckFlag = isArraySorted(arr);
		if (arrayCheckFlag)
			System.out.println("Given array is sorted...");
		else
			System.out.println("Given array is not sorted...");
	}
	
	public static boolean isArraySorted(int arr[]) {
		boolean arrayCheckFlag = true;
		for (int i=0; i<arr.length-1 ; i++) {
			if (arr[i] > arr[i+1]) {
				arrayCheckFlag = false;
				break;
			}
		}
		return arrayCheckFlag;
		
	}
}

