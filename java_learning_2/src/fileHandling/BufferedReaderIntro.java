package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderIntro {
	public static void main(String[] args) {
	char[] ch = new char[100];
	try {
		Reader reader = new FileReader("C:\\Users\\Atul\\Desktop\\filesfolder\\newFile.txt");
	    BufferedReader buffer = new BufferedReader(reader);
	    buffer.read(ch);
	    System.out.println(ch);
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}