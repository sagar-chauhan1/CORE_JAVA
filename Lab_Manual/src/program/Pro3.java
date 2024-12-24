package program;
import java.util.*;

public class Pro3 {
	
	public static void main(String args[]) {
		
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the First num");
		int x=s1.nextInt();
		System.out.println("Enter the Second num");
		int y=s1.nextInt();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char ch=s1.next().charAt(0);
		double result;

		switch(ch) {
		case '+': 
			result = x+y;
			System.out.println(x + " + " + y + " = " + result);
			break;
	
		case '-': 
			result = x-y;
			System.out.println(x + " - " + y + " = " + result);
			break;
		
		case '*': 
			result = x*y;
			System.out.println(x + " * " + y + " = " + result);
			break;
		
		case '/':  if(y!=0){
			result = x/y;
			System.out.println(x + " / " + y + " = " + result);
			}else {
				System.out.println("Cannot divide by zero");
			}
			break;
		
		default : 
			System.out.println("Invalid operator");
		
	}
	}
}
