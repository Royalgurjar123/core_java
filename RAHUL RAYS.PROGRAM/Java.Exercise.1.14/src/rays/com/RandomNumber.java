package rays.com;

public class RandomNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int d =(int) (Math.random() * 100);
			System.out.println(d);
		}
	}
}
