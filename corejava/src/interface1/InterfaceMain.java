package interface1;

public class InterfaceMain {
	
	public static void main(String args[]) {
		Bounceable b1 = new Ball();
		Movable m1 = new Car();
		Movable b2 = new Ball();
		b1.bounce();
		m1.move();
		b2.move();
	}
	
	
}
