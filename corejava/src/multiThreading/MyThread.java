package multiThreading;

public class MyThread extends Thread{
	
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(i+" "+ Thread.currentThread().getName());
	}
		
	}
	public static void main(String args[]) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
	}
}
