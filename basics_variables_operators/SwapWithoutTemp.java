package basics_variables_operators;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without using a temporary variable
        a = a + b; // Now a holds the sum of a and b
        b = a - b; // Now b holds the original value of a
        a = a - b; // Now a holds the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
