package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro2 {

	public static void main(String[] args) {
		//Absolute Path
		File file = new File("C:\\Users\\Atul\\Desktop\\filesfolder\\file1.txt");
        boolean result;
		try {
			result = file.createNewFile();
			if(result){
	        	System.out.println("File created successfully");
	        }else{
	        	System.out.println("Some error occurred..");
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}