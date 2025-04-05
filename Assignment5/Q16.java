package Assignment5;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String filePath=sc.nextLine();
		File file=new File(filePath);
		if(!file.exists()) {
			System.out.println("File doesn't exists.");
		}else {
			System.out.println("File Metadata:");
			System.out.println("File Name: "+file.getName());
			System.out.println("Absolute Path: "+file.getAbsolutePath());
			System.out.println("File Size: "+file.length()+"bytes");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("Last Modified: "+sdf.format(file.lastModified()));
			file.setWritable(false);
			System.out.println("Readable: "+file.canRead());
			System.out.println("Writable: "+file.canWrite());
			System.out.println("Executable: "+file.canExecute());
			if(file.isFile()) {
				System.out.println("Type:Regular File");
			}else if(file.isDirectory()) {
				System.out.println("Type:Directory");
			}
		}
		sc.close();
	}

}
