// Interface Shape
interface Shape {
    double area();
}

// Rectangle Class
class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}

// Triangle Class
class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Test Class
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(6, 3);

        System.out.println("Area of Rectangle = " + r.area());
        System.out.println("Area of Triangle = " + t.area());
    }
}