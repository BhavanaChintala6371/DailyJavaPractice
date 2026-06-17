package methods;

public class AddMethod {

    // This method takes two int parameters: a and b.
    // It returns the sum of a and b.
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // add(10, 20) returns 30.
        // The returned value is stored in result.
        int result = add(10, 20);

        System.out.println("Sum is: " + result);
    }
}