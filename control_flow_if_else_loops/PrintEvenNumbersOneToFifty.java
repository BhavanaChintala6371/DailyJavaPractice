package control_flow_if_else_loops;

/**
 * Problem 5: Print all even numbers from 1 to 50
 * Concept tested: Loop with condition in Java.
 */

public class PrintEvenNumbersOneToFifty {
    public static void main(String[] args) {

        // Print even numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}