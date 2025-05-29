package JavaProgram;

public class without_space_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int rowCnt = 10;
		for(int i=0; i<rowCnt; i++) {
			for(int k=rowCnt-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i+counter; j++) {
				System.out.print("*");
			}
			counter++;
			
			System.out.print("\n");
			
		}
		

	}

}
