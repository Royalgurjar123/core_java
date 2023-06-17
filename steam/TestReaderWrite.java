package io.steam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReaderWrite {
	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("D:\\Rays\\RAHUL RAYS.PROGRAM\\hello.txt");
		FileWriter f1 = new FileWriter("D:\\Rays\\RAHUL RAYS.PROGRAM\\hello-copy.txt");
		BufferedReader br = new BufferedReader(f);
		PrintWriter out = new PrintWriter(f1);
		String l = br.readLine();
		while (l !=null) {
		System.out.println(l);
		out.println(l);
		
		l = br.readLine();
		}
		f1.close();
		br.close();
	}

}
