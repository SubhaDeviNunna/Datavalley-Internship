import java.util.Scanner;

// Shape class
class Shape {
    // Method to calculate area of the shape
    public double calculateArea() {
        return 0;
    }

    // Method to print the shape details
    public void printDetails() {
        System.out.println("Shape");
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Overriding the printDetails method
    @Override
    public void printDetails() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
    }
}

public class MethodOverloadingOverridingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for the Rectangle:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        printArea(rectangle); // Method overloading
        printDetails(rectangle); // Method overriding

        scanner.close();
    }

    // Method overloading to print area of the shape
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

    // Method overriding to print details of the shape
    public static void printDetails(Shape shape) {
        shape.printDetails();
    }
}
