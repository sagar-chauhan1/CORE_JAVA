package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializMain {
	
	public static void main(String args[]) {
		String filePath="C:\\Users\\Bharat\\OneDrive\\Desktop\\file.txt";
		try {
			FileOutputStream fout = new FileOutputStream(filePath);
			
			ObjectOutputStream about = new ObjectOutputStream(fout);
			SerializDemo ser = new SerializDemo(321,"sagar",34000);
			about.writeObject(ser);
			System.out.println("Object Stored into the file Sucessfully");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
