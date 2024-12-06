package multiThreading;

public class SynchronizedMain {
	
	public static void main(String args[]) {
		Thread t1 = new SynchronizedDemo("dharmik");
		Thread t2 = new SynchronizedDemo("jay");
		
		t1.start();
		t2.start();
		
	}
}
