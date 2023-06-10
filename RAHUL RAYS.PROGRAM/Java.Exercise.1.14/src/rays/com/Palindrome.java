package rays.com;

public class Palindrome {
public static void main(String[] args) {
	int number=142;
	int r=0;
	int sum =0; 
	int n=number;
	while (n>0) {
		r =n%10;
		sum =(sum*10)+r;
		n =n/10;
		
	}
	if (sum==number) {
		System.out.println("palindrome number="+number);
		
	} else {
		System.out.println("not palindrome number="+number);

	}
}
}
