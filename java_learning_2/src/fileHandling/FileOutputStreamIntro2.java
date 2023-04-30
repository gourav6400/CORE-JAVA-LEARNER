package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamIntro2 {

	public static void main(String[] args) {
		String data = "Writing in a new file.\nThis is the second line";
		try {
			OutputStream output =new FileOutputStream("C:\\Users\\Atul\\Desktop\\filesfolder\\newFile2.txt");
		    byte[] arr = data.getBytes();
		    output.write(arr);
		    System.out.println("Data written successfully..");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}

	}

}