package rays.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestEmployee { 
	public static void main(String[] args) {
		Employee e1 = new Employee (1, "rahul", "indore");
		Employee e2 = new Employee (2, "monil", "indore");
		Employee e3 = new Employee (3, "rajat", "devas");
		Employee e4 = new Employee (4, "arun", "mumbai");
		Employee e5 = new Employee (5, "navin", "ujjain");

		
		System.out.println(e1.equals(e2));
	//	System.out.println(e2.equals(e3));
	//	System.out.println(e3.equals(e4));
	//	System.out.println(e4.equals(e5));
		
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	//	System.out.println(e3.hashCode());
	//	System.out.println(e4.hashCode());
	//	System.out.println(e5.hashCode());
		
		
		List l = new ArrayList ();
		 // l.add("one");
		 // System.out.println(l);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		//System.out.println(l);
		
		
	Iterator it = l.iterator();
	while (it.hasNext()) {
		Employee e = (Employee) it.next();
		System.out.println(e.getId());
		//System.out.println(e.getName());
		//System.out.println(e.getAdress());
		
		
		
		
		
	}
		
		
	}
		
	}



