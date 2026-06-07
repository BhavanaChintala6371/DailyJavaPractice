package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 3: Temperature Converter (Celsius to Fahrenheit)
 * This program demonstrates user input, arithmetic operations, and data types.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Initialize Scanner to read keyboard input
        Scanner input = new Scanner(System.in);

        // Prompt the user clearly before blocking the terminal for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert using explicit double literals (9.0/5.0) to prevent integer truncation
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Display the converted output cleanly
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit.");

        // Close the scanner resource to prevent memory leaks
        input.close();
    }
}
