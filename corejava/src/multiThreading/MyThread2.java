package multiThreading;

public class MyThread2 implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		Runnable r1 = new MyThread2();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();		
	}

}
