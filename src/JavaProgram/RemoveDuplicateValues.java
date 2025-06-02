package JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		String s1[] = {"Swati", "Ravi", "Swara", "Swati"};

		HashSet<String> hs1 = new HashSet<String>();
//		HashSet<String> hs2 = new HashSet<>();

		for(int i = 0; i<s1.length; i++) {
			if(!hs1.contains(s1[i])) {
				hs1.add(s1[i]);
			}
			//			else {
			//				hs2.add(s2[i]);
			//			}
			//		}

		}
		System.out.println("After removed Duplicate strings are: " +hs1);

	}
}