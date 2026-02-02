// program to demonstrate the static variable, static block, static method
public class StaticExample {
    static String message;
    static {
        //Static block
        message = "Hello, welcome to Java programming!";
    }
    // static method 
    static void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // static method call
        StaticExample.displayMessage();
    }
}