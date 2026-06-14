package control_flow_if_else_loops;

public class PrintNumbersExceptMultiplesOfThree {
    public static void main(String[] args){
        for(int i=1; i<=100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i);

            if (i < 100){
                System.out.print(", ");
            }
        }
    }
}
