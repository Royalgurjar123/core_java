package rays.com;

public class Harmonicseries {
	public static void main(String[] args) {
		 int a =5;
		 double b=0.0;
		 System.out.println("harmonic series-");
		 while (a>0) {
			 b =b+(double) 1/a;
			 a--;
			 
			 System.out.print(b+",");
			
		}
		
	}

}