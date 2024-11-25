package interface1;

public class Ball implements Bounceable,Movable{
	 
	public void bounce() {
		System.out.println("bounce");
	}
	
	public void move() {
		System.out.println("move");
	}

}
