package rays.com;

public class Fibonanicseries {
public static void main(String[] args) {
	int n=10, firstterm =0,secondterm =1;
	System.out.println("fibonanicseries"+n+ "terms:");
	for( int i=1;i<=n;++i) {
		System.out.print( firstterm +" ,");
		int nextterm =firstterm +secondterm;
		firstterm =secondterm;
		secondterm =nextterm;
	}
	
	}
}

 