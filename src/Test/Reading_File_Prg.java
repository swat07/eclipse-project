package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_File_Prg {

	public static void main(String[] args) {
		try {
			
			File myFileObj = new File("C:\\\\Users\\\\MalviyaSwati\\\\OneDrive - Applied Information Sciences\\\\Desktop\\\\filename.txt");
			Scanner myReader = new Scanner(myFileObj);
			while (myReader.hasNextLine()) {
				String data =myReader.nextLine();
				System.out.println(data);
				
			}
			myReader.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured:");
			e.printStackTrace();
			
		}

	}

}
