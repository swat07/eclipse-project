package Assignments;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		int s1[] = {1, 3, 5, 3, 6, 1};
		   
		   HashSet<Integer> hs1 = new HashSet<>();
		   HashSet<Integer> hs2 = new HashSet<>();
		   for(int i=0; i<s1.length; i++){
			if(!hs1.contains(s1[i]))
			{
				hs1.add(s1[i]);
			}
			else{
				hs2.add(s1[i]);
			}
			
		   }
		   System.out.println(hs2);

	}

}
