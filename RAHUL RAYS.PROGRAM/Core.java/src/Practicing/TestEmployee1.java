package Practicing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployee1 { 
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1 ,"two" ,"indore");
		Employee1 e2 = new Employee1(2,"one" ,"indore");
		Employee1 e3 = new Employee1(3 ,"three" ,"indore");
		Employee1 e4 = new Employee1(4 ,"four" ,"indore");
		Employee1 e5 = new Employee1(5 ,"five" ,"indore");
		
	//	System.out.println(e1.equals(e2));
	//	System.out.println(e2.equals(e3));

	//	System.out.println(e1.hashCode());
	//	System.out.println(e2.hashCode());
		
		List l = new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
	//	 System.out.println(l);
		
		 Iterator it = l.iterator();
		 while (it.hasNext()) {
			Employee1 e = (Employee1) it.next();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAdress());
			
		}
		  
		
	}

}