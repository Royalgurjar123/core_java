package rays.com;
//largest number of the array
public class Question15 {
public static void main(String[] args) {
	int a [] = { 19,42,43,54,75,96,78,89,95,1000};
	int i; 
	int max= a[0];
	for (i =0;i < a.length; i++) {
		if (a[i]> max) {
			max = a [i];
			
		}
		
	}
	System.out.println("largest number"+ max);
}

}
