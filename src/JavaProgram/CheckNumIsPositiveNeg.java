package JavaProgram;

public class CheckNumIsPositiveNeg {

	public static void main(String[] args) {
		int myNum = -5;
		
		if (myNum > 0) {
			System.out.println("Number is positive:" +myNum);
		}
		else if(myNum < 0) {
			System.out.println("Number is negative:" +myNum);
		}
		else {
			System.err.println("Number is 0");
			
		}

	}

}
