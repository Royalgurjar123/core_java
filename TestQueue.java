package rays.collectionframework;

import java.util.LinkedList;

public class TestQueue {
	public static void main(String[] args) {
	LinkedList queue = new LinkedList();
	
       queue.offer("ram");
       queue.offer("rahul");
       queue.offer("raj");
       queue.offer("ramu");
       queue.offer("raju");

       System.out.println(queue.peek());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       
       
       
       
	}

}
