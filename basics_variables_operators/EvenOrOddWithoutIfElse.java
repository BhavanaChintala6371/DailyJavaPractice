package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 8: Check if a number is even or odd
 * Demonstrates modulus evaluation combined with boolean flag storage.
 */
public class EvenOrOddWithoutIfElse {
    public static void main(String[] args) {
        // Initialize user input reader
        Scanner input = new Scanner(System.in);

        // Prompt user for local terminal testing clarity
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        // Check if remainder is zero when divided by 2
        boolean isEven = (number % 2 == 0);

        // Display results clearly
        System.out.println("Number Entered: " + number);
        System.out.println("Number is Even?: " + isEven);

        // Close resource hook safely
        input.close();
    }
}
