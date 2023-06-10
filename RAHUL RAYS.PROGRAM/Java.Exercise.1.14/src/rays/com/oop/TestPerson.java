package rays.com.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException  {
		Person p = new Person();
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		p.setDob(d);
	
		p.setName("rahul");
		p.setAddress("MR10");
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(Person.AVG_AGE);
	}

}
