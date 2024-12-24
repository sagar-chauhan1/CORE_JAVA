package program;

public class Pro4 {
	
	public static void main(String args[]) {

		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		int count=0;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				count++;
				System.out.print(" "+count+" ");
			}
			System.out.println();
		}
	}

}
