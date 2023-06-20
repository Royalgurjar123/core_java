package threads.com;

public class TestHelloThread {
	public static void main(String[] args) {
		HelloThread H1 = new HelloThread("rahul");
        HelloThread H2 = new HelloThread("gurjar");
        H1.start();
        H2.start();
        
        
        
        for (int i = 0; i < 50; i++) {
        	System.out.println("main");
			
		}
		
	
		
		
		
	}

}
