package FileEx;
import java.io.File;
import java.io.IOException;
public class Q3 {

	public static void main(String[] args) {
			File f=new File("newfile.txt");
			if(f.exists()) {
				System.out.println("File exists!");
			
			if(f.canWrite()) {
				System.out.println("file is WRITABLE");
			}
			else {
				System.out.println("File is not writable");
			}
      boolean var=f.setWritable(true);
      if(var) {
    	  System.out.println("Write permission enabled");
      }else {
    	  System.out.println("Failed to change write permission");
      }
  }
      else {
    	  System.out.println("file doesn't exist");
      }
	}

}
