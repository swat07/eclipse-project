package JavaProgram;

import java.util.Scanner;

public class TriangleProg {

	public static void main(String[] args) {
		
//		   *     1 star  8 space
//		  * *    2 star  6 space
//		 * * *   3 star  4 space
//		* * * *  4 star  2 space
//	   * * * * * 5 Star  0 space
		
		
//		   *
//		  * *
//		 * * *
//		* * * *
//	   * * * * *
//		* * * *
//		 * * *
//		  * *
//		   *
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide input: ");
		int rowCnt = sc.nextInt();
		sc.close();
		
		for(int i=0; i<rowCnt; i++) {
			for(int k=rowCnt-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.print("\n");
			
		}
		for(int i=0; i<rowCnt-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
				}
			
			for(int k=rowCnt-1; k>i; k--) {
				System.out.print("* ");
				
			}
			System.out.print("\n");
			
			
		}
		

	}
	
}
