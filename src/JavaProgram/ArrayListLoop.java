package JavaProgram;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("volvo");
		arr.add("BMW");
		arr.add("Honda");
		System.out.println(arr);
		for(String i : arr) {
			System.out.println(i);
		}

	}

}
