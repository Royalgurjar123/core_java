package io.steam;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
	public static void main(String[] args) throws Exception {
	 FileWriter f = new FileWriter("D:\\Rays\\RAHUL RAYS.PROGRAM\\rahul.txt");
	 f.write(" hello am  rahul gurajr");
	 f.write("arun is maid one ");
      f.close();	
      
	}

}
