package evenNum;
import java.util.*;
public class Number {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=11;i<=30;i++) {
			num.add(i);
		}
		System.out.println(num);
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		even=num;
		for(int j=0;j<=20;j++) {

			if(j%2==0) {				
				even.add(j);
			}
		}
		System.out.println(even);
		
		
	}
}
