package Assignment5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file path:");
        String s = sc.nextLine();
        File sf = new File(s);
        
        if (!sf.exists()) {
            System.out.println("Source file doesn't exist.");
            return;
        }
        
        System.out.println("Enter the destination file path:");
        String d = sc.nextLine();
        File df = new File(d);
        
        if (df.exists()) {
            System.out.println("Destination file already exists. Overwrite (yes/no)?");
            String r = sc.next().toLowerCase();
            if (!r.equals("yes")) {
                System.out.println("Copy operation cancelled!");
                return;
            }
        }
        
        // File copy operation
        try (FileInputStream fis = new FileInputStream(sf);
             FileOutputStream fos = new FileOutputStream(df)) {
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            // Read from the source file and write to the destination file
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully!");
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred during the file copy operation.");
        } 
    }
}