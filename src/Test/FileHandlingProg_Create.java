package Test;

import java.io.File;
import java.io.IOException;

public class FileHandlingProg_Create {

	public static void main(String[] args) {
		try {
			
			File fileObj = new File("C:\\Users\\MalviyaSwati\\OneDrive - Applied Information Sciences\\Desktop\\filename.txt");
			if (fileObj.createNewFile()) {
				System.out.println("File created: " + fileObj.getName()); 
			}
			else {
				System.out.println("File already exists.");
			}
			
		}
		catch (IOException e) 
		{	
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}

