import java.io.*;
public class FileFoundEx {

	public static void main(String[] args) {
		try {
			FileReader f=new FileReader("nonexist.txt");
			BufferedReader b=new BufferedReader(f);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
