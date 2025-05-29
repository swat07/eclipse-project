package Test;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_File {

	public static void main(String[] args) {
		try {
			
			FileWriter fileWrite = new FileWriter("C:\\Users\\MalviyaSwati\\OneDrive - Applied Information Sciences\\Desktop\\filename.txt");
			fileWrite.write("This is the first line:");
			fileWrite.close();
			System.out.println("Successfully wrote to the file.");
		}
		
		catch (IOException e) {
			System.out.println("Error occured during writing in a file:");
			e.printStackTrace();
		}

	}

}
