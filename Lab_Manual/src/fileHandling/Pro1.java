package fileHandling;

import java.io.*;
import java.util.*;

public class Pro1 {
	
	public static void main(String args[]) {
		
		//code to write to a file
		
		String filePath="C:\\Users\\Bharat\\OneDrive\\Desktop\\file2.txt";
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			fileWriter.write("this is our file from this java course");
			
			System.out.println("data Stored into the File Sucessfull");
			
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		} 
	
		
		
		
	}

}
