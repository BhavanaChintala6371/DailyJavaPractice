package control_flow_if_else_loops;

import java.util.Scanner;

/**
 * Problem 7: Check even or odd
 * Input a number and print whether it is even or odd.
 * Demonstrates modulo operator logic and conditional branching.
 */
public class EvenOrOddUsingIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        
        input.close();
    }
}
