package Assignments;

public class RotateArraybyKPositions {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
        int temp[] = new int[a.length];
        int k = 1;
        int newIndex = 0;
        for(int i=0; i<a.length; i++){
            newIndex = i+k;
           if(newIndex >= a.length)
           newIndex = newIndex - a.length;
           temp[newIndex] =a[i];
        }
        
        for(int val: temp){
            System.out.print(val +" ");
        }
        
           
        
		
	}

}

