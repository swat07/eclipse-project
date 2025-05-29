package Assignments;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int factorial = 1; 
		if(num < 0) {
			System.out.println("Factorial is not defined for negative values:" +num);
		}
		else {
			for(int i=1; i<=num; i++) {
				 factorial= factorial * i;
			}
			System.out.println("Factorial of number '"+num+"': " +factorial);
		}

	}

}
