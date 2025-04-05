package Assignment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File file=new File("diary.txt");
		if(!file.exists()) {
			System.out.println("Error: The file 'diary.txt' doesn't eexists");
			return;
		}
		try( BufferedReader f1=new BufferedReader(new FileReader(file))){
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
