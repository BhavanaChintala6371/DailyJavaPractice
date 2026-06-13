package control_flow_if_else_loops;

import java.util.Scanner;

public class CalculateGradeFromMarks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = input.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 75){
            System.out.println("Grade B");
        } else if(marks >=50){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
        input.close();
    }
}
