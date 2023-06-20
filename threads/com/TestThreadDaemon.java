package threads.com;

public class TestThreadDaemon {
	public static void main(String[] args) {
	ThreadDaemon d1 = new ThreadDaemon("rahul");
	ThreadDaemon d2 = new ThreadDaemon("raja");
	ThreadDaemon d3 = new ThreadDaemon("raju");
	ThreadDaemon d4 = new ThreadDaemon("ram");
	d1.setDaemon(true);
	d2.setDaemon(true);
	d3.setDaemon(true);
	d4.setDaemon(true);
	
	d1.start();
	d2.start();
	d3.start();
	d4.start();
	for (int i = 0; i <=50; i++) {
		try {
			Thread.sleep(200);
			
		} catch (Exception e) {
		
		}
		System.out.println(i+"=+lalu");
		
	}
	

	}

}
