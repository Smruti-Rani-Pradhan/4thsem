package FileEx;

import java.io.*;
public class InputStreamEx {

	public static void main(String[] args) {
		String n="output.txt";
		try(FileInputStream f=new FileInputStream(n)) {
			InputStreamReader f1=new InputStreamReader(f);
	       int d;
	       while((d=f.read())!=-1) {
	        	System.out.println((char)d);
	        }
	       
		}catch( FileNotFoundException e) {
			System.out.println("File not found:"+n);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
