package Assignments;
public class SumofNeighbors {
//"Given an array of integers, create a new version of the array where each element is 
//replaced with the sum of its neighboring elements, including itself.
//Replace each element in an array with the 
//sum of itself and its left and right neighbor (0 if out of bounds).
	
	public static void main(String[] args) {

		int[] num= {10, 1, 4, 8, 2, 3, 1};
		int[] num1 = new int[num.length];
		
//// Step 1: Copy original array to preserve values
		int count = 0;
		for (int val : num) {
			num1[count] = val;
			count++;
		}
		
//Index 0: 10 + 1 = 11
//Index 1: 10 + 1 + 4 = 15
		for(int i=0; i<num.length; i++) {
			if (i==0)
				num[i] = num1[i] + num1[i+1];
			else if (i==num.length-1)
				num[num.length-1] = num1[i-1] + num1[i];
			else
				num[i] = num1[i] + num1[i+1] + num1[i-1];

		}
		System.out.println("Modified array (sum of neighbors):");
		for (int number : num)
			System.out.print(number + " ");

	}
	
}
