package Assignments;
public class SumofNeighbors {

	public static void main(String[] args) {

		int[] num= {10, 1, 4, 8, 2, 3, 1};
		int[] num1 = new int[num.length];

		int count = 0;
		for (int val : num) {
			num1[count] = val;
			count++;
		}

		for(int i=0; i<num.length; i++) {
			if (i==0)
				num[i] = num1[i] + num1[i+1];
			else if (i==num.length-1)
				num[num.length-1] = num1[i-1] + num1[i];
			else
				num[i] = num1[i] + num1[i+1] + num1[i-1];

		}

		for (int number : num)
			System.out.print(number + " ");

	}

}
