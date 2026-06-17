package methods;

public class SquareMethod {

    // This method takes one int parameter: n.
    // It returns the square of n.
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        // square(5) returns 25.
        // The returned value is stored in result.
        int result = square(5);

        System.out.println("Square is: " + result);
    }
}