package exception;
import java.util.*;
public class InvalidEmailExceptionMain {

	public static void main(String args[]) {
		boolean exit = true;
		
		Scanner s1 = new Scanner(System.in);
		do {
			
		System.out.println("Enter your Email");
		String email=s1.next();
		
		if(email.contains("@") && email.contains(".com")) {
			System.out.println("Your Email : "+email);
			exit = false;
		}
		else {
			try {
				throw new InvalidEmailException();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		}while(exit == true);
	}
}
