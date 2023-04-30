package fileHandling;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamIntro {
 
	public static void main(String[] args){
	 //String data = "I am currently using OutputStream.";
	 try {
		OutputStream output = new FileOutputStream("C:\\Users\\Atul\\Desktop\\filesfolder\\file1.txt");
	    //byte[] databytes = data.getBytes();
	   // output.write(databytes);
		output.write(65);
		output.write(66);
		output.write(67);
	    System.out.println("Writing operation done...");
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}