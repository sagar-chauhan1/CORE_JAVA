package interface_;

public interface FirstInterface {
	
	public void display();
	
	default void show() {
		System.out.println("Default FirstInterface");
	}
//	private void pri() {
//		System.out.println("Private method FirstInterface");
//	}
}
