package rays.com.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account u =  new Account();
		u.setAccountType("current");
		System.out.println(u.getAccountType());
		u.setBalance(50000);
		System.out.println(u.getBalance());
		u.setNumber("SBI7675465");
		System.out.println(u.getNumber());
		u.deposit(45000);
		System.out.println(u.getBalance());
		u.withdraw(49000);
		System.out.println(u.getBalance());
		u.fundtransfer(21000);
		System.out.println(u.getBalance());
		u.paybill(5000);
		System.out.println(u.getBalance());
	}

}
