package rays.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection List1 = new ArrayList();
		 
		List1. add ("one");
		List1.add(100);
		
		
		Collection List2 = new ArrayList();
		
		List2.add("two");
		List2.add(200);
		
	System.out.println(List1);
	System.out.println(List1);
	
	List1.addAll(List2);
	System.out.println(List1);
	
//	List2.clear();
//	System.out.println(List2);
	
	
    System.out.println(List1.contains("one"));	
    System.out.println(List1.containsAll(List2));
    
     System.out.println(List1.isEmpty());
    
    
   // List1.remove(100);
   // System.out.println(List1);
    
   // List1.removeAll(List1);
   // System.out.println(List1);
    
    List1.retainAll(List2);
    System.out.println(List2);
    
    System.out.println(List1.size());
	
	}

}