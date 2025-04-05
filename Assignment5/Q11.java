package Assignment5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "diary.txt";
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The file 'diary.txt' does not exist. Please create it first.");
            return; 
        }

        System.out.println("Write your new diary entry: ");
        String newEntry = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = LocalDateTime.now().format(formatter);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) { // 'true' for append mode
            bw.write("Date: " + currentDateTime + "\n");
            bw.write(newEntry + "\n");
            bw.write("---------------------------\n");
            System.out.println("New entry appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the diary.");
            e.printStackTrace(); 
        } finally {
            sc.close();
        }
    }
}