package control_flow_if_else_loops;
import java.util.*;
public class CheckPalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int reverse =0;

        if(temp < 0){
            System.out.println(number +" is not a Palindrome");
        }else{
            while(temp > 0){
                int lastDigit = temp % 10;
                reverse = reverse * 10 + lastDigit;
                temp = temp/10;
            }
        }
        if(number == reverse){
            System.out.println(number + " is a palindrome");
        }else{
            System.out.println(number + " is not a palindrome");
        }
        input.close();
    }
}
