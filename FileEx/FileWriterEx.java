package FileEx;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("output.txt");
	        f.write("Hello,this is a test file \n");
	        f.write("JAVA file handling ex");
	        f.close();
	        System.out.println("DATA WRITTEN !");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
