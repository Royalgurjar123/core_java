package rays.com;

public class Reverse2 {
	public static void main(String[] args) {
	
	 String [] name = {"core","java"};
	 
	 for (int i = 0; i < name.length; i++) {
		 
		 for ( int j = name[i].length()-1;j>=0;j--){
			 System.out.println(name[i].charAt(j));
			
		 }	 
		 System.out.println("     ");
		 }
		
	}
	 }


