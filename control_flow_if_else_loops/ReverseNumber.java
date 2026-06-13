package control_flow_if_else_loops;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int reverse = 0;
        int temp = Math.abs(number);
        while(temp > 0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }
        if(number < 0){
            reverse = -reverse;
        }
        System.out.println("Reverse of this "+number+" is: "+reverse);
        input.close();
    }
}
