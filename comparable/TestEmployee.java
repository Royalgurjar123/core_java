package rays.comparable;

import java.util.*;
import java.util.Collection;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		 List l = new ArrayList();
		 
		l.add(new Employee(5,"ram","indore"));
		l.add(new Employee(4,"raj","devas"));
		l.add(new Employee(9,"yash","oon"));
		l.add(new Employee(7,"mohan","ujjain"));
		
		
		//Collections.sort (l);
		Collections.sort(l, new OrderByAddress());
		 for(Object object:l) {
			 System.out.println(object);
		 }
		
		 
		 
		 
		 
	}

}
