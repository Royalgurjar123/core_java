package rays.collectionframework;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList a1= new  ArrayList();
		a1.add("one");
		a1.add(100);
		
		ArrayList a2 = new ArrayList();
		a2.add("two");
		a2.add(200);
		
	a1.add("khargone");
	System.out.println(a1);
	a1.addAll(a2);
	System.out.println(a1);
		
		System.out.println(a2.get(1));
		System.out.println(a1.remove(0));
		a1.set(0, "rahul");
		System.out.println(a1);
		
		System.out.println(a1.subList(0,2));
		
		
		System.out.println(a2.indexOf("two"));
		System.out.println(a2.lastIndexOf(200));
		
		
		
	}

}