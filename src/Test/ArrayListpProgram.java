package Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListpProgram {
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add(1, "Ford");
		cars.remove(3);
//		System.out.println(cars);
		System.out.println(cars.get(2));
		System.out.println("Size of list is: " +cars.size());
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		//********************
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(11);
		numbers.add(12);
		numbers.add(7);
		numbers.add(10);
		for (int i: numbers) {
			System.out.println("Printing number list: "+i);
		}
		
		//********************
		
		Collections.sort(numbers);
		for(int j: numbers) {
			System.out.print("\nAfter Sorting number list: "+j);
		}
		
	}

}
