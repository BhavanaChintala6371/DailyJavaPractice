package methods;

public class FindMaxMethod {

    // This method takes two int parameters: a and b.
    // It returns the bigger number.
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {

        // findMax(45, 70) returns 70.
        // The returned value is stored in max.
        int max = findMax(45, 70);

        System.out.println("Maximum number is: " + max);
    }
}