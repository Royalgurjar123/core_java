package Exceptionhandling;

public class FamilyPropogation {
	public static void main(String[] args) {
		dad();

	}

	public static void dad()  {
		
		try {
			mom();
		} catch (MistakeExpection e ) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}

	}

	public static void mom()throws MistakeExpection     {
		
		son();

	}

	public static void son() throws MistakeExpection {
		
		throw new MistakeExpection();

	}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
