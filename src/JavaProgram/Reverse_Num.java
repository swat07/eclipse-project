package JavaProgram;

public class Reverse_Num {

	public static void main(String[] args) {
		int num = 14542;
		int revNum = 0;
		while(num>0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}
		System.out.print(revNum);
		
	}

}
