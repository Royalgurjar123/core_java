package rays.com;

public class PrimeNumber {
	public static void main(String[] args) {	
		int number= 9;
		int count = 0;

		for (int i = 2; i < number; i++) {
			
			if (number % i == 0) {
				
				count++;
				
			}
			
		}
		
		if (count == 0) {
			
			System.out.println("Prime");
			
		} else {
			
			System.out.println("Not Prime");

		}
	}
}
