package synchronizedDemo;

public class Account {
	
	private int accNo;
	private String name;
	private double balance;
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;

	}
	
	public synchronized void withdraw(double amount) throws InterruptedException{
		
		System.out.println("Balance before withdrawal:" + balance);
		balance = balance - amount;
		Thread.sleep(1000);
		System.out.println("Balance after withdrawal:" + balance);
		Thread.sleep(1000);
	}
		public void deposite(double amount) throws InterruptedException{
		
		synchronized (this) {
				
		System.out.println("Balance before deposite:" + balance);
		balance = balance + amount;
		Thread.sleep(1000);
		System.out.println("Balance after deposite:" + balance);
		Thread.sleep(1000);
		}
	}

		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
		}
	
}
