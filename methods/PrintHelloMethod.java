package methods;

public class PrintHelloMethod {

    // This is a void method.
    // void means this method does not return any value.
    // Its only job is to perform an action, here it prints a message.
    public static void printHello() {
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {

        // Method call:
        // Java goes to the printHello() method,
        // executes the code inside it,
        // then comes back to the next line in main.
        printHello();
    }
}