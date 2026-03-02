// Custom Exception
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

// Main Class
public class OddCheck {

    // Method to check number
    public static void checkNumber(int num) throws OddNumberException {
        
        if (num % 2 != 0) {
            throw new OddNumberException("Number is Odd!");
        } else {
            System.out.println("Number is Even.");
        }
    }

    public static void main(String[] args) {

        int number = 5;   

        try {
            checkNumber(number);
        }
        catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}