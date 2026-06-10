// Import only the Scanner class to keep the code light and explicit
import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        // Create a Scanner object to read inputs from the user's keyboard
        Scanner input = new Scanner(System.in);
        
        // Read input as a double to support both whole numbers and decimals
        double number = input.nextDouble();
        
        // Check if the number is strictly greater than zero
        if (number > 0) {
            System.out.println("Entered number is positive: " + number);
        } 
        // Check if the number is strictly less than zero (only if first check failed)
        else if (number < 0) {
            System.out.println("Entered number is negative: " + number);
        } 
        // If it is neither positive nor negative, it must be zero
        else {
            System.out.println("Entered number is zero: " + number);
        }
        
        // Close the scanner to prevent memory and system resource leaks
        input.close();
    }
}
