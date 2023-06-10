package rays.com;

public class LowerString {
public static void main(String[] args) {
	String name ="rahul";
	System.out.println(name.toUpperCase());
	 String name1 ="GURJAR";
	System.out.println(name1.toLowerCase());
	// string buffer to string convert
	String s1 = "core ";
	StringBuffer sb = new StringBuffer("core");
	sb.append(" java");
	
	// lower method
	String s3 = sb.toString();	String name2 =" RAHULGURJAR";
	System.out.println(name.toLowerCase());
	//upper method
	String name3="rohitgurjar";
	System.out.println(name.toUpperCase());
}

}
