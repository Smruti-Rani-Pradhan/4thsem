package Assignment5;

import java.io.File;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path file to delete");
		String d=sc.nextLine();
		File d1=new File(d);
		if(d1.exists()) {
			if(d1.delete()) {
				System.out.println("File deleted successfully");
			}
			else
				System.out.println("Failed to delete");
		}
		else
			System.out.println("File doesn't exist!");
 }
}
