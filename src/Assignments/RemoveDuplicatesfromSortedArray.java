package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		//		Write a method to remove duplicates from 
		//		a sorted array in-place and return the new length.


		int arr[]= {0,0,1,1,1,2,2,3,3,4};

		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(!hs1.contains(arr[i])){
				hs1.add(arr[i]);
			}
			else{
				hs2.add(arr[i]);
			}

		}
		System.out.println("Array after removed duplicates:" +hs2);
		System.out.println("Size of Array is:" +hs2.size());


	}
}





//		int arr[]= {0,0,1,1,1,2,2,3,3,4};
//		ArrayList<Integer> hs1 = new ArrayList<Integer>();
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if ((arr[i] == arr[j]) & (!hs1.contains(arr[i])))  {
//					hs1.add(arr[i]);
//					break;
//					
//				}
//			}
//			
//		}
//		System.out.println("Size of Array is : " + hs1.size());
//		System.out.println(hs1);
//		
//		
//		
//	}
//}