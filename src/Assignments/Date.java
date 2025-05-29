package Assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		
		String date = "12/10/2016";     //o/p---12 September 2016
		
		DateTimeFormatter inPutFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter outPut = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		
		
		LocalDate date1 = LocalDate.parse(date, inPutFormatter);
		String changedDate = date1.format(outPut);
		System.out.println(changedDate);
		}

}
