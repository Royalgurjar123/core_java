package io.steam;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestEmail {
	public static void main(String[] args) throws Exception {
		InputStreamReader f = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(f);
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\Rays\\RAHUL RAYS.PROGRAM\\email-copy.txt"));
		String  line = br.readLine();
		while (line.equals("quite")) {
if (line.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
	pw.println(line);	
}	
line = br.readLine();

		}
		pw.close();
		br.close();
		f.close();
		
		
		
				}

}
