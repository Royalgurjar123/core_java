package io.steam;


import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestDeserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("D:\\Rays\\RAHUL RAYS.PROGRAM\\rahul.txt");
		ObjectInputStream in = new ObjectInputStream(f);
		 
		Marksheet m =( Marksheet) in.readObject();
		
		System.out.println(m.rollno);
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.physics);
		System.out.println(m.maths);
	
		
	}

}
