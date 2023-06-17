package io.steam;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws Exception  {
		FileReader f = new FileReader("D:\\Rays\\RAHUL RAYS.PROGRAM\\rohit.txt");
		Scanner sc = new Scanner(f);
		
		while (sc.hasNext()) {
		 System.out.println(sc.nextLine());
		}
		f.close();
		
		sc.close();
	}

}
