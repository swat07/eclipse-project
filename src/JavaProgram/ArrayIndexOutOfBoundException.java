package JavaProgram;

public class ArrayIndexOutOfBoundException {

	private static Exception ArithmeticException = null;

	public static void main(String[] args) throws Exception{
		try {
			int arr[]= {1,2,3,4,5};
//			int b = 10/0;
			
			for (int i=0 ; i<arr.length ; i++) {
				System.out.println(arr[i]);
			}
			throw ArithmeticException;
		}
		catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("Handling the array index out of bound exception..." + err.getMessage());
		}
		
		catch(Exception err) {
			System.out.println("This is 2nd catch block..." + err.getMessage());
		}
		
		finally {
			System.out.println("This is a finally block...");
		}
		

	}

}
