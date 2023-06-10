package rays.com;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException  {
		
	//Date today = new Date();
		
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	//String s = sdf.format(today);
	
	//System.out.println(s);
	
		String src = "30/01/1993";
		
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sdf1.parse(src);
		
		Date today = new Date();
		
	
		
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		String s = sdf.format(today);
		
		System.out.println(s);
	}
}
