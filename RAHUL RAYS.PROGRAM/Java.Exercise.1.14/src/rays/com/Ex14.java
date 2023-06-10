package rays.com;

public class Ex14 {
public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int num = 100;
	for (int i = 2; i <= num; i=i+2) {
		a = a+i;
	}
	a = a/(num/2);
	System.out.println("even number = "+a);
	for (int i = 1; i <= num; i=i+2) {
		b = b + i;
	}
	b =b /(num/2);
	System.out.println("odd number = "+b);
}
}
