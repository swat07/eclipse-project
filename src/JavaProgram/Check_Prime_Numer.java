package JavaProgram;

public class Check_Prime_Numer {

	public static void main(String[] args) {
//		A prime number can only be divided by 1 and itself — it has no other factors.
		
		int num = 155;
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false; // Found a factor, not prime
					break;  //No need to check further
				}
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime number.");
		}
		else
            System.out.println(num + " is not a prime number.");
		
		
	}

}
