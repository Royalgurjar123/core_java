package threads.com;

public class TestHelloRunnable  extends Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("rahul"));
		Thread t2 = new Thread(new HelloRunnable("raja"));
       t1.start();
       t2.start();
       for (int i = 0; i < 50; i++) {
    	   System.out.println("main");
		
	}
		
	}

}
