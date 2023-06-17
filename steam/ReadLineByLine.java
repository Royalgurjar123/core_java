package io.steam;


import java.io.BufferedReader;

import java.io.FileReader;


public class ReadLineByLine {
	public static void main(String[] args) throws Exception  {
		FileReader f = new FileReader("D:\\Rays\\RAHUL RAYS.PROGRAM\\rahul.txt ");
		BufferedReader in = new BufferedReader(f);
		String line	 = in.readLine();
		
		while (line!= null) {
			System.out.println(line);
			line =in.readLine();  			
		}
	
	}		

}
