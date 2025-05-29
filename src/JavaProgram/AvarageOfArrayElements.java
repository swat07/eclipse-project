package JavaProgram;

public class AvarageOfArrayElements {

	public static void main(String[] args) {
		int a[] = {4, 8, 2, 7};
		float avg , sum = 0;
		int arryLen = a.length;
		
		for(int i : a) {
			sum = sum + i;
			
		}
		avg = sum/arryLen;
		System.err.println(avg);
	}

}
