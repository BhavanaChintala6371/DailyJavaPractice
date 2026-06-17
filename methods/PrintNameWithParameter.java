package methods;

public class PrintNameWithParameter {

    // This method has one parameter: String name.
    // The value passed while calling the method will be stored in name.
    public static void printName(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // "Bhavana" and "Radha" are arguments.
        // They are actual values sent to the printName method.
        printName("Bhavana");
        printName("Radha");
    }
}