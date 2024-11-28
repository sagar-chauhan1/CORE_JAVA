package exceptionhandleing;

public class pro1 {
	
	public static void main(String args[]) {
		
		String name = null;
		
		System.out.println("statement 1");
		System.out.println("statement 2");
		try {
			System.out.println("statement 3"+name.length());
		}
		catch(Exception e1){
			System.out.println(e1.getMessage());
//			e1.printStackTrace();
		}
		
		System.out.println("statement 4");
		System.out.println("statement 5");
		
	}

}
