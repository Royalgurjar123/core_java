package rays.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		 HashSet  h = new HashSet();
		 
		 h.add(10);
		 h.add(20.5);
		 h.add("rahul");
		 h.add("gurjar");
		 
//		 System.out.println(h.contains("rahu"));
		 
		 Iterator it = h.iterator();
		 while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		 
	}

}
