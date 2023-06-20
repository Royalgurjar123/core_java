package threads.com;

public class ThreadDaemon extends Thread {
	 String name = null;
	 
	 public ThreadDaemon(String name) {
		 this.name = name;
		  
	 }
	 public void run() {
		 while (true) {
			 for (int i = 0; i <=50; i++) {
       try {
    	   Thread.sleep(200);
    	   System.out.println(i+"="+name);
       }   catch (Exception e) {
			
			}
			
		}
		
	}

}
}