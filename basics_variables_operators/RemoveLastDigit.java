package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 7: Remove the last digit of a number
 * Concept tested: Integer division truncation behavior in Java.
 */
public class RemoveLastDigit {
    public static void main(String[] args) {
        // Initialize user input reader
        Scanner input = new Scanner(System.in);

        // Prompt user for input (Perfect for local terminal interaction)
        System.out.print("Enter any integer number: ");
        int number = input.nextInt();

        // Drop the last digit using integer division by 10
        int updatedNumber = number / 10;

        // Display results clearly
        System.out.println("Actual Number is: " + number);
        System.out.println("Number after removing last digit: " + updatedNumber);

        // Safely close the input resource
        input.close();
    }
}
