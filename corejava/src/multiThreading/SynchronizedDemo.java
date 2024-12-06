package multiThreading;

public class SynchronizedDemo extends Thread{
	
	String arr[] = {"jaya","is","object","oriented","programming","language"};
	
	public SynchronizedDemo(String name) {
		super(name);
	}
	
	public void run() {
		Display.display(arr);
	}

}
