package control_flow_if_else_loops;

public class PrintStarPattern {
    public static void main(String[] args){
        for(int row = 1; row <= 5; row++){
            for(int star = 1; star <= row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
