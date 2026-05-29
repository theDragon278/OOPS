package IntroToOOPS;

class Rectangle {
    private double length;
    private double width;

    Rectangle() {
        this(1.0, 1.0);
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}

public class PracticeConstructor {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2.0, 3.0);
        System.out.println(rec.calculateArea());
        rec.displayDetails();
    }
}
