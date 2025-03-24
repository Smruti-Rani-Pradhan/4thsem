package Assignment3;
import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        // Call the method to read an integer
        int num=readInteger();
        System.out.println("you entered:"+num);
    }

    public static int readInteger() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Please enter an integer:");
        
         while(true) {
        try {
            
            System.out.println("Enter an integer: ");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } 
    }
    }
}
