import java.util.Scanner;

class Area {
    double length;
    double breadth;

    // Method to set dimensions
    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and return area
    public double getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        // Create object and set dimensions
        Area rect = new Area();
        rect.setDim(length, breadth);

        
        System.out.println("Area of rectangle: " + rect.getArea());

        sc.close();
    }
}