package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamIntro {

	public static void main(String[] args) {
		byte[] arr = new byte[100];
		try {
			InputStream input = new FileInputStream("C:\\Users\\Atul\\Desktop\\filesfolder\\newFile.txt");
			//System.out.println("Available bytes in file :"+input.available());
		    input.read(arr);
		    for(byte data:arr){
		    	System.out.println(data);
		    }
		    
		    String data = new String(arr);
		    System.out.println(data);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}