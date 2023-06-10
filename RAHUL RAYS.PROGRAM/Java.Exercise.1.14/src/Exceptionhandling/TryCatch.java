package Exceptionhandling;

public class TryCatch {
	public static void main(String[] args) {
	try {
		String name = "Rahul";
		System.out.println("name ="+ name);
		int a = 10;
		int b =0 ;
		int c = a/b;
		System.out.println("division="+ c);

	} catch (Exception e) {
	System.out.println("not divisible by zero");
	}
	}

}
