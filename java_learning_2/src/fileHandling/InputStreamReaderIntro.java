package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderIntro {
	public static void main(String[] args) {
		char[] arr  = new char[100];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Atul\\Desktop\\filesfolder\\newFile.txt");
		    
			InputStreamReader reader = new InputStreamReader(fileInputStream);
			reader.read(arr);
			System.out.println(arr);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}