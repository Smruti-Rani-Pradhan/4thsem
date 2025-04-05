package Assignment5;
import java.io.File;
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the current file name
        System.out.println("Enter the current file path:");
        String currentFilePath = sc.nextLine();
        File oldFile = new File(currentFilePath);
        
        // Check if the current file exists
        if (!oldFile.exists()) {
            System.out.println("The specified file does not exist.");
            sc.close();
            return;
        }
        
        // Get the new file name
        System.out.println("Enter the new file name (including file extension):");
        String newFilePath = sc.nextLine();
        File newFile = new File(oldFile.getParent(), newFilePath);
        
        // Attempt to rename the file
        boolean success = oldFile.renameTo(newFile);
        
        // Confirm renaming status
        if (success) {
            System.out.println("File renamed successfully to: " + newFile.getPath());
        } else {
            System.out.println("Failed to rename the file. Please check if the new file name is valid or if the file is in use.");
        }

        sc.close();
    }
}