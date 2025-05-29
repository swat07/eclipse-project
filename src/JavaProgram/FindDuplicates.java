package JavaProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		
//		input = {4,5,8,4,5,5}
//		outPut = {4,5}
		int a[] = {4,5,8,4,5,5};
		
////		HashSet<Integer> arrList = new HashSet<>();
//		ArrayList<Integer> arrList = new ArrayList<>();
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] == a[j] & !arrList.contains(a[i])) {
//					arrList.add(a[i]);
//				}
//			}
//		}
//		System.out.println(arrList +" ");
		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			if(!hs1.contains(a[i])) {
				hs1.add(a[i]);
			}
			else {
				hs2.add(a[i]);
			}
		}
		System.out.println("Duplicate values:" +hs2);
		
		
		
	}
	
}

//Example Execution Flow (for array: {4, 5, 8, 4, 5}):
//i	j	a[i]	a[j]	Match?	Action	HashSet
//0	1	4	5	No	-	-
//0	2	4	8	No	-	-
//0	3	4	4	Yes	Add 4	[4]
//0	4	4	5	No	-	[4]
//1	2	5	8	No	-	[4]
//1	3	5	4	No	-	[4]
//1	4	5	5	Yes	Add 5	[4, 5]
//2	3	8	4	No	-	[4, 5]
//2	4	8	5	No	-	[4, 5]
//3	4	4	5	No	-	[4, 5]

