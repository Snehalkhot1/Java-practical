import ExceptionHandlingDemo.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);   // Change second value to test
            System.out.println("Result: " + result);
        }
        catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}