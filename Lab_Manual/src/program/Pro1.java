package program;

class Demo{
	
	int x;
	int y;
//	public Demo(){
//		System.out.println(x);
//	}
	
}

public class Pro1 {
	
	public static void main(String args[]) {
		
		Demo d1 = new Demo();
		d1.x = 5;
		System.out.println(d1.x);
		d1 = new Demo();
		System.out.println(d1.x);
		
		
	}

}
