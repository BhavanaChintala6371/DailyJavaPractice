package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 4: Find the remainder when a number is divided by 10
 * Demonstrates basic modulus operation and interactive input.
 */
public class RemainderByTen {
    public static void main(String[] args) {
        // Initialize user input reader
        Scanner input = new Scanner(System.in);

        // Print interactive text prompt
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        // Calculate the last digit using the modulus operator
        int remainder = number % 10;

        // Print the final result cleanly
        System.out.println(number + " divided by 10 the remainder is: " + remainder);

        // Close resource hook safely
        input.close();
    }
}
