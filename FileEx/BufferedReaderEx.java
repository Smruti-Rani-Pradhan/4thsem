package FileEx;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferedReaderEx {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("Output.txt");
			BufferedReader f1=new BufferedReader(f);
	       String line;
	       while((line=f1.readLine())!=null) {
	        	System.out.println(line);
	        }
	       f1.close();
	      }catch(IOException e) {
			e.printStackTrace();
		}
	}

}
