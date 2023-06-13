package rays.collectionframework;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestFailFast {
	public static void main(String[] args) {
		 List l = new CopyOnWriteArrayList();
		 l.add(100);
		 l.add("one");
		 l.add(200);
		 l.add("two");
		 
		 Iterator it = l.iterator();
		 l.addAll(l);
		 
		 l.add(300);
		 
		 while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
			
		}
	
			
		}
		 
	


