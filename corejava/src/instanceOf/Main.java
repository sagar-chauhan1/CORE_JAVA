package instanceOf;

public class Main {
		
	public static void main(String args[]) {
		
		Child c1 = new Child();
		
		if(c1 instanceof Child) {
			System.out.println("c1 is instance of Child");
		}
		else {
			System.out.println("c1 is Not instance of Child");
		}
		
		if(c1 instanceof Parent) {
			System.out.println("c1 is instance of Parent");
		}
		else {
			System.out.println("c1 is Not instance of Parent");
		}
		
		if(c1 instanceof Object) {
			System.out.println("c1 is instance of Object");
		}
		else {
			System.out.println("c1 is Not instance of Object");
		}
		
	}
}
