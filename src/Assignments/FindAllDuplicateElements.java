package Assignments;

import java.util.HashSet;

public class FindAllDuplicateElements {
//	Given an array of integers, return a list of 
//			elements that appear more than once using HashSet or HashMap.

	public static void main(String[] args) {
		int a[] = {5, 8, 4, 5, 7, 4};
		
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
		System.out.println(hs2);
		

	}

}
