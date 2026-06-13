package control_flow_if_else_loops;
import java.util.*;

public class SumOfNumbersFromOnetoN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = input.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to "+n+ " is: "+sum);
        input.close();
    }
}
