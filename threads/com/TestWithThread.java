package threads.com;

public class TestWithThread {
	public static void main(String[] args) {
		WithThread t1 = new WithThread("prisha");
		WithThread t2 = new WithThread("Krisha");
		WithThread t3 = new WithThread("Trisha");
		
		t1.setPriority(10);
		t2.setPriority(6);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();

		
		
		
	}

}
