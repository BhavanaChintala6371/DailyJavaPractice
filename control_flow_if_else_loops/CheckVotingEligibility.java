package control_flow_if_else_loops;

import java.util.*;

public class CheckVotingEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:  ");
        int age = input.nextInt();

        if(age <= 0 || age > 120){
            System.out.println("Invalid age");
        }else if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
        input.close();
    }
}
