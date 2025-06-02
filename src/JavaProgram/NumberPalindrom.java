
//This Java program checks whether a given number is a palindrome or not. 
//A palindrome number is a number that reads the same backward as forward (like 151, 121, 1331, etc.).

package JavaProgram;

public class NumberPalindrom {

	public static void main(String[] args) {
		int num = 1511;
		int finalNum = num;
		int revNum = 0;
		
		while(num > 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
			
		}
		if(revNum == finalNum) {
			System.out.println("Number is palindrom:" +finalNum);
		}
		else {
			System.out.println("Number is not a palindrom:" +finalNum);
		}

	}

}
//Let’s break it down using 151:
//
//Iteration 1:
//
//rem = 151 % 10 → 1
//
//rev = 0 * 10 + 1 → 1
//
//num = 151 / 10 → 15
//
//Iteration 2:
//
//rem = 15 % 10 → 5
//
//rev = 1 * 10 + 5 → 15
//
//num = 15 / 10 → 1
//
//Iteration 3:
//
//rem = 1 % 10 → 1
//
//rev = 15 * 10 + 1 → 151
//
//num = 1 / 10 → 0
//
//Loop ends since num == 0.
//
//Now, rev = 151