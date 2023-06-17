 package io.steam;


import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("D:\\Rays\\RAHUL RAYS.PROGRAM\\hello.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
	    Marksheet m = new Marksheet();
	    m.rollno = 10;
	    m.name = "rahul";
	    m.chemistry =50;
	    m.physics = 40;
	    m.maths = 30;
	    
	    out.writeObject(m);
	    out.close();
	    f.close();
	    
	    
	    }

}
