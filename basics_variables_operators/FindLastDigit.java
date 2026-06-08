package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 6: Find the last digit of a number
 * Concept: Isolating the final digit using the modulus (%) operator.
 */
public class FindLastDigit {
    public static void main(String[] args) {
        // Initialize the scanner object
        Scanner input = new Scanner(System.in);

        // ALWAYS prompt the user before blocking for input
        System.out.print("Enter any integer number: ");
        int number = input.nextInt();

        // Isolate the final digit
        int lastDigit = number % 10;

        // Print the clear final result
        System.out.println("LastDigit of the number " + number + " is " + lastDigit);

        // Close resource hook safely
        input.close();
    }
}
