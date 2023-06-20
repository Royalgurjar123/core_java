package threads.com;

public class HelloRunnable implements Runnable {
	private String name  = null ;
	
	
	public HelloRunnable(String n) {
		this.name= n;
		
	}
	
	public  void run() {
		for (int i = 0; i < 50; i++) {
     System.out.println(i+name);			
		}

	}

}
