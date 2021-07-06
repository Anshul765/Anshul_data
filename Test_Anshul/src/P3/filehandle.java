package P3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filehandle {

	public static void main(String[] args) throws IOException {
		filehandle obj = new filehandle();
		obj.ReadData(1);
		obj.ReadDataodRange(1,4);
	}

	public void ReadData(int rownum) throws IOException {
		File file = new File("../Test_Anshul/rown.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int x=0;
		while((s=br.readLine())!=null) {
			x = x + 1;
			if(x == rownum) {
				System.out.println(s);
			}
		}
	}
	
	public void ReadDataodRange(int fnum,int lnum) throws IOException {
		File file = new File("../Test_Anshul/rown.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int x=0;
		while((s=br.readLine())!=null) {
			x = x + 1;
			if(x > fnum && x < lnum) {
				System.out.println(s);
			}
		}
	}
}	