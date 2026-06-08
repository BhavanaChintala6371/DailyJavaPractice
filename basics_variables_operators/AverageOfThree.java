package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 9: Find the average of three numbers
 * Demonstrates double division and precise 3-decimal output formatting.
 */
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Calculate average using a double literal to preserve precision
        double average = (a + b + c) / 3.0;

        System.out.println("Numbers are: " + a + " " + b + " " + c);
        
        // Print formatted to exactly 3 decimal places using comma argument separation
        System.out.printf("Average of numbers is: %.3f\n", average);

        input.close();
    }
}
