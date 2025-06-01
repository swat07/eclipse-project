package JavaProgram;

public class PrimNumPrac {

	public static void main(String[] args) {
		int num = 10;
		boolean isPrime = true;
		
		 if(num <= 0)
		 {
			 isPrime = false;
		 }
		 else {
			 
 //This loop checks divisibility starting from 2 up to num/2 - 1.
// For num = 10, loop will run for i = 2, 3, 4.
			 
			 for(int i=2; i <= num/2; i++) {
				 if(num%i == 0) {
					 isPrime = false;
					 break;
				 }
			 }
		 }
		if(isPrime) {
			System.out.println("Number is prime :" );
		}
		else {
			System.out.println("Number is not a prime");
		}
		
	}

}
