package fileHandling;

import java.io.File;
import java.io.IOException;

public class FIleIntro {

	public static void main(String[] args)  {
		//Using relative path:
		File file = new File("newFile.txt");
		System.out.println(file);
		try {
			boolean result = file.createNewFile();
			if(result){
				System.out.println("File created successfully");
			}else{
				System.out.println("There is some error while creating a file");
			}
		} catch (IOException e) {
			System.out.println("Exception handled successfully");
		}

	}

}