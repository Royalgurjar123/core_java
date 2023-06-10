package rays.com;

public class Triangle {
	public static void main(String[] args) {
		int n = 5;
		int i;
		for (i = 1; i <= 10; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print("\t");
			}
			n = n - 1;
			for (int k = 1; k <= i; k++) {
				System.out.print("*" + "\t");
			}
			i = i + 1;
			System.out.println("\t");
			System.out.println("\t");
		}
	}

}
