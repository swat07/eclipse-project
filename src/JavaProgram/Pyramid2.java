package JavaProgram;

public class Pyramid2 {
	
public static void main(String[] args) {
		
//		    * 4 space 1 star
//		   ** 3 space 2 star
//		  *** 2 space 3 star
//		 **** 1 space 4 star
//		***** 0 space 5 star
	

	
//	 *****	
//	 ****
//	 ***
//	 **
//	 *
//		for(int i=0; i<6; i++) {
////			System.out.print("\n");
//			for(int j=i; j<6; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
////		System.out.print("");
		for(int i=0; i<5; i++) {
			for(int j=i; j<4; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
