package P3;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		FileWrite obj = new FileWrite();
		/*obj.WriteData(6);
		obj.WriteDataForRange(3,8); */
		obj.ReadandWrite();
	}
	public void WriteData(int nrow) throws IOException  {
		File file = new File("../Test_Anshul/writefile.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		String a = " ";
		for(int i=1;i<nrow;i++) {
		System.out.println("Enter your data "+i+" line" );	
		a = sc.nextLine();
		bw.write(a);
		bw.newLine();
		}
		bw.close();
	}
	
	public void WriteDataForRange(int frow, int lrow ) throws IOException  {
		File file = new File("../Test_Anshul/writefile.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		String a = " ";
		for(int i=1;i<=lrow;i++) {
		System.out.println("Enter your data "+i+" line" );	
		a = sc.nextLine();
		if(i > frow && i < lrow) {
		bw.write(a);
		bw.newLine();
		}
		}
		bw.close();
	}
	
	public void ReadandWrite() throws IOException  {
		
		File Rfile = new File("../Test_Anshul/rown.txt");
		FileReader fr = new FileReader(Rfile);
		BufferedReader br = new BufferedReader(fr);
		
		File Wfile = new File("../Test_Anshul/writefile2.txt");
		FileWriter fw = new FileWriter(Wfile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String a;
		
		while((a=br.readLine())!=null) {
			bw.write(a);
			bw.newLine();
		}
		bw.close();
	}
}
