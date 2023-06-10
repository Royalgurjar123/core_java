package Exceptionhandling;

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
		this.balance = balance + d;
	}

	public void withdraw(double w) throws InSufficientFund {
		this.balance = balance - w;
		if (balance < 500) {
			InSufficientFund e = new InSufficientFund();
			throw e;

		}
		System.out.println("withdrawl=" + w);
	}

	public void fundtransfer(double f) throws InSufficientFund {
		this.balance = balance - f;
		if (balance < 500) {
			InSufficientFund e = new InSufficientFund();
			throw e;
		}
		System.out.println("fundtransfer=" + f);
	}

	public void paybill(double p) throws InSufficientFund {
		this.balance = balance - p;
		if (balance < 500) {
			InSufficientFund e = new InSufficientFund();
			throw e;
		}
		System.out.println("paybill=" + p);
	}

}
