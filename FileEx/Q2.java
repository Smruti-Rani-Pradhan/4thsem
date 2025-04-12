package FileEx;
import java.io.File;
import java.io.IOException;
public class Q2 {

	public static void main(String[] args) {
			File f=new File("newfile1.txt");
			if(f.exists()) {
				System.out.println("File exists!");
			}
			else {
				System.out.println("File doesn't exists");
			}

	}

}
