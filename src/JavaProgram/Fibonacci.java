package JavaProgram;

public class Fibonacci {

	public static void main(String[] args) {
		//The Fibonacci series is a series where the next term is the sum of the previous two terms. 
//		The first two terms of the Fibonacci sequence are 0 followed by 1..
//		o/p --- 0,1,1,2,3,5,8,13,21....
				
		int num = 10;
		int prevNum = 0;
		int nextNum = 1;
//This loop will run from i = 1 to i = 9, a total of 9 times (since we already have the first value prevNum ready).
		for(int i=1; i<num; i++) {
//This prints the current Fibonacci number, starting with prevNum, followed by a space.
			System.out.print(prevNum +" ");
			int sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
			
		}
	}

}
