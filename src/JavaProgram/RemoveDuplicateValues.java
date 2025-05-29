package JavaProgram;

import java.util.ArrayList;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		String s1[] = {"Swati", "Ravi", "Swara", "Swati"};
		ArrayList<String> arrList = new ArrayList<>();
		for(String result : s1) {
			if(!arrList.contains(result)) {
				arrList.add(result);
			}
			
			
		}
		System.out.print(arrList);
		
	}

}
