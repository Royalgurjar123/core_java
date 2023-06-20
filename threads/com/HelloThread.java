package threads.com;

public class HelloThread extends Thread {
	private String  name = null;
	
	
	public HelloThread(String n) {
   this.name = n;
   
   

   }
	
	   public void run () {
		   for(int i = 0 ;i<50;i++) {
			   System.out.println(i+name);

	}
	   }
}
