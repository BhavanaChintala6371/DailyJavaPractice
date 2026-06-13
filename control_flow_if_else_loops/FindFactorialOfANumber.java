package control_flow_if_else_loops;
import java.util.*;

public class FindFactorialOfANumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = input.nextInt();
        long factorial = 1;
        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }else{
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("factorial of "+n+" is: "+factorial);
        }
        input.close();
    }
}
