package io.steam;


import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {
	public static void main(String[] args) throws IOException  {
		FileReader  f = new FileReader("D:\\Rays\\RAHUL RAYS.PROGRAM\\hello.txt");// path copy 
		int ch = f.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = f.read();
		}
		

		
		
	}

}
