package control_flow_if_else_loops;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+"X"+i+"="+(number*i));
        }
        input.close();
    }
}
