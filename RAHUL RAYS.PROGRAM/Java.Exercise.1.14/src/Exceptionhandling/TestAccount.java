package Exceptionhandling;

public class TestAccount {
	public static void main(String[] args) throws InSufficientFund {

		Account a = new Account();
		a.setBalance(5000);
		a.setAccountType("saving");
		a.setNumber(" 3456789000");
	
		
		a.deposit(500);
	
			a.withdraw(1501);
			
		
		
		
	}	
	}

