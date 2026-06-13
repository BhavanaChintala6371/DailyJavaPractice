package control_flow_if_else_loops;
import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = input.nextInt();
        System.out.println("Enter Second Number: ");
        int b = input.nextInt();
        System.out.println("Enter Third Number: ");
        int c = input.nextInt();

        if(a >= b && a >= c){
            System.out.println(a+ " is the largest number");
        }else if(b >= a && b >= c){
            System.out.println(b+ " is the largest number");
        }else{
            System.out.println(c+ " is the largest number");
        }
        input.close();
    }
}
