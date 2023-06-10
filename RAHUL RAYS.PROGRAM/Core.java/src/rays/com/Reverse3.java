package rays.com;

public class Reverse3 {
public static void main(String[] args) {
	int number =134;
	int r=0;
	int sum=0;
	while (number>0) {
		r= number%10;
		sum =(sum*10)+r;
		number =number/10;
		
	}
	System.out.println(sum);
	
}
}
