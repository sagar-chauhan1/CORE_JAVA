package exception;
import java.util.*;

public class ExceptionMain {

	public static void main(String args[]) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = s1.nextInt();
		
		if(age>=18) {
			System.out.println("Vote Here!" +
								"\n 1.BJP"+
								"\n 2.SHIVSENA"+
								"\n 3.RASHTRAVADI");
		}else {
			throw new InvalidAgeException();
		}
	}
}
