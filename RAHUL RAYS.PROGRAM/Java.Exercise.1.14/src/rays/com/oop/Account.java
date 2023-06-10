package rays.com.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	 public void deposit(double d) {
	this.balance=balance +d;	
	}
	public void withdraw(double w) {
	 this.balance=balance-w;
	 if (balance<500) {
		 System.err.println("Insufficient Balance");
		
	}
}
	public void fundtransfer(double f) {
		this.balance=balance-f;
	}
	public void paybill(double p) {
		this.balance=balance-p;
	}
}