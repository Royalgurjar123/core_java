package Exceptionhandling;


public class TestLoginExpection2 {
	public static void main(String[] args)  throws  LoginExpection{
		auth("RAHUL");
		
	}
	private static void auth(String login) throws LoginExpection{
		if (!login.equals("Admin")) {
			LoginExpection e= new LoginExpection();
			System.out.println(e.getMessage());
			throw e;
			
		}
	}
	}

