package Exceptionhandling;

public class TestPropagation {

	public static void main(String[] args) {
		
		dad();

	}

	public static void dad()  {
		
		try {
			mom();
		} catch (InSufficientFund e ) {
		
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public static void mom() throws InSufficientFund {
		
		son();

	}

	public static void son() throws InSufficientFund {
		
		throw new InSufficientFund();

	}

}
