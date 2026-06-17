package methods;

public class PrintAgeWithParameter {

    // This method takes one int parameter called age.
    // Whatever number we pass while calling the method will be printed.
    public static void printAge(int age) {
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {

        // 22 and 25 are arguments passed to the printAge method.
        printAge(22);
        printAge(25);
    }
}