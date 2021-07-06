package P3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) throws IOException {
		File fl = new File("../Test_Anshul/java_dummy.txt");
		FileReader fr = new FileReader(fl);
	
		int a;
		while((a=fr.read())!=-1) {
			System.out.println((char)a);
		}
	/*
		BufferedReader b = new BufferedReader(fr);
		String s;
		
		while((s = b.readLine()) != null) {
			System.out.println(s);
		}
	*/	
	}
}	