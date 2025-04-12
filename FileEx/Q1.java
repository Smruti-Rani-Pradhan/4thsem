package FileEx;
import java.io.File;
import java.io.IOException;
public class Q1 {

	public static void main(String[] args) {
		try {
			File f=new File("newfile.txt");
			if(f.createNewFile()) {
				System.out.println("File created successfully!");
			}
			else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
