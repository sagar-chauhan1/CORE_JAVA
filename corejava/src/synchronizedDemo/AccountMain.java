package synchronizedDemo;

public class AccountMain {
	
	public static void main(String args[]) {
		Account ac = new Account(1244,"jay chauhan", 10000.00);
		
		Thread t1 = new ATMTransaction(ac, 2000.00, "withdraw");
		Thread t2 = new ATMTransaction(ac, 2000.00, "deposite");
		
		t1.start();
		t2.start();
		
	}

}
