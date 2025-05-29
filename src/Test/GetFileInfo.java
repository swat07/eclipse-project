package Test;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		File myObj = new File("C:\\\\Users\\\\MalviyaSwati\\\\OneDrive - Applied Information Sciences\\\\Desktop\\\\filename.txt");
		if (myObj.exists()) {
			System.out.println(myObj.getAbsolutePath());
			System.out.println(myObj.getName());
			System.out.println(myObj.length());
		}
		else {
			System.out.println("The file does not exist.");
		}
	}

}
