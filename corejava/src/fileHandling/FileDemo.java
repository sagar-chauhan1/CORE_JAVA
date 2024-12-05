package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FileDemo {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type here......");
		String data = sc.nextLine();
		
		try {
			String filePath="C:\\Users\\Bharat\\OneDrive\\Desktop\\file.txt";
			FileOutputStream fout = new FileOutputStream(filePath);
			
			fout.write(data.getBytes());
			
			System.out.println("data Stored into the File Sucessfull");
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
