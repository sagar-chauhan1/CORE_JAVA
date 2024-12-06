package synchronizedDemo;

public class ATMTransaction extends Thread{
	
	Account ac;
	double amount;
	String flag;
	
	public ATMTransaction(Account ac, double amount, String flag) {
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}
	
	public void run() {
		try {
		if(flag.equals("withdraw")) {
			ac.withdraw(amount);
		}	
		else {
			ac.deposite(amount);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
