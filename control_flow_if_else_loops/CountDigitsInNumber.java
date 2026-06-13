package control_flow_if_else_loops;

import java.util.*;

public class CountDigitsInNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int count = 0 ;
        int temp = Math.abs(number);
        if(temp == 0){
            count = 1;
        }else{
            while(temp > 0){
                count++;
                temp = temp/10;
            }
        }
        System.out.println(number+ " has "+ count+ " digits.");
        input.close();
    }
}
