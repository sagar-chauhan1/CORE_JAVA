package program;


public class Pro6 {
	
	public static void main(String args[]) {
		
		int i,j;
		int count = 15;
		
		for(i=0;i<5;i++) {
			for(j=5;j>i;j--) {
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}
		
		
	}

}
