package Assignment5;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        // Main menu loop
        while (true) {
            // Display the menu
            System.out.println("\nSelect an operation:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Find index of a character");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");

            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    // Convert to lowercase
                    System.out.println("Result: " + userString.toLowerCase());
                    break;
                
                case 2:
                    // Convert to uppercase
                    System.out.println("Result: " + userString.toUpperCase());
                    break;
                
                case 3:
                    // Search for a character
                    System.out.print("Enter the character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    if (userString.indexOf(searchChar) != -1) {
                        System.out.println("The character '" + searchChar + "' was found in the string.");
                    } else {
                        System.out.println("The character '" + searchChar + "' was not found in the string.");
                    }
                    break;
                
                case 4:
                    // Find index of a character
                    System.out.print("Enter the character to find the index: ");
                    char indexChar = scanner.nextLine().charAt(0);
                    int index = userString.indexOf(indexChar);
                    if (index != -1) {
                        System.out.println("The character '" + indexChar + "' is at index " + index + ".");
                    } else {
                        System.out.println("The character '" + indexChar + "' is not found in the string.");
                    }
                    break;
                
                case 5:
                    // Concatenate with another string
                    System.out.print("Enter the string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    System.out.println("Result: " + userString + anotherString);
                    break;
                
                case 6:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice, please select a valid option.");
            }
        }
    }
}
