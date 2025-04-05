package Assignment5;

import java.io.File;
import java.util.*;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the directory path");
		String d=sc.nextLine();
		File d1=new File(d);
		if(d1.exists() && d1.isDirectory()) {
			File[] f=d1.listFiles();
			if(f!=null && f.length>0) {
				System.out.println("Contents of directory");
			}
			for(File f1: f) {
				if(f1.isDirectory()) {
					System.out.println("Dir:"+f1.getName());
				}
				else
					System.out.println("File:"+f1.getName());
			}
			
		}else {
			System.out.println("Directory doesn't exist");
		}
		sc.close();

	}

}
