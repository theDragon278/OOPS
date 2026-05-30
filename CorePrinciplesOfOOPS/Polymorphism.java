package CorePrinciplesOfOOPS;

class ShapeCalculator {
    public void area(int radius) {
        System.out.println("Area of Circle: " + (double) 3.14 * radius * radius);
    }

    public void area(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    public void area(int base1, int base2, int height) {
        System.out.println("Area of Trapezoid: " + (double) ((base1 + base2) * height) / 2);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        calculator.area(7); // Circle
        calculator.area(10, 5); // Rectangle
        calculator.area(8, 12, 6); // Trapezoid
    }
}
