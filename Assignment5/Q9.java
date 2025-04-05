package Assignment5;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fileName="diary.txt";
		File file=new File(fileName);
		if(file.exists()) {
			System.out.println("Diary file exists.File creation stopped to avoid overwriting.");
		}else {
			System.out.println("Creating new diary file...");
			System.out.println("Write your diary entry:");
			String entry=sc.nextLine();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd:hh:mm:ss");
			String currentDateTime=LocalDateTime.now().format(formatter);
		
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write("Date:"+currentDateTime+"\n");
			bw.write(entry+"\n");
			bw.write("-------------\n");
			bw.close();
			System.out.println("Entry Saved Successfully.");
	    }catch(IOException e) {
	        System.out.println("Error writing to the diary.");
	    }
	}sc.close();
	}
}
