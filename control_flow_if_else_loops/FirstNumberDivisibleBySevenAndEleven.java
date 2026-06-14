package control_flow_if_else_loops;

public class FirstNumberDivisibleBySevenAndEleven {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0 && i % 11 == 0) {
                System.out.println("First Number divisable by 7 and 11 is: " + i);
                break;
            }
        }
    }
}
