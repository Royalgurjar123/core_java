package Exceptionhandling;

public class LoginExpection extends Exception {
	
	 public LoginExpection() {
		  
		 super("invalaid user ----!!!!!!");  
	 }
	 
	 public LoginExpection(   String msg) { 
		 super(msg);
		   
	 }
	

}
