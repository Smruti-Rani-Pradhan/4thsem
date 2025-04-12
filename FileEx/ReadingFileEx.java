package FileEx;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFileEx {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("output.txt");
			int ch;
	        while((ch=f.read())!=-1) {
	        	System.out.println((char)ch);
	        }
	        f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
