package JavaProgram;

public class CheckNumIsEvenOdd {

	public static void main(String[] args) {
		int num = 20;
		if(num % 2 == 0) {
			//The % operator is the modulus operator.It gives the remainder 
			//after dividing number by 2.
			System.out.println("NUmber is even:" +num);
		}
		else {
			System.out.println("number is odd");
		}

	}

}
