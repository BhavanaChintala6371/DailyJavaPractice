package control_flow_if_else_loops;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("a = " + a + " is greater than b = " + b);
        } else if (b > a) {
            System.out.println("b = " + b + " is greater than a = " + a);
        } else {
            System.out.println("Both numbers are equal");
        }

        input.close();
    }
}