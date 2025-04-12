package FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("buffered.txt");
			BufferedWriter f1=new BufferedWriter(f);
	       f.write("This is an efficient way to write files");
	       f1.newLine();
	       f.close();
	       System.out.println("Data Written Successfully!");
	      }catch(IOException e) {
			e.printStackTrace();
		}

	}

}
