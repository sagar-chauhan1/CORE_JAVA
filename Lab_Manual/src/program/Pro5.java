package program;
import java.util.*;
public class Pro5 {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the * Number");
		Scanner s1 = new Scanner(System.in);
		int x=s1.nextInt();
		int i,j;
		for(i=1;i<=x;i++) {
			for(j=x;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
