package basics_variables_operators;

import java.util.Scanner;

/**
 * Problem 5: Voting Eligibility Checker
 * Demonstrates relational operators and boolean data storage.
 */
public class VotingEligibility {
    public static void main(String[] args) {
        // Initialize the keyboard input scanner
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for input clarity
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        // Evaluate the relational condition and store the boolean result
        boolean isEligible = age >= 18;
        
        // Display the final output
        System.out.println("Age Entered: " + age);
        System.out.println("Is this person eligible to vote: " + isEligible);
        
        // Clean up resources
        input.close();
    }
}
