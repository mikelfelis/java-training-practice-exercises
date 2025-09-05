import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle (w=" + width + ", h=" + height + ")";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle (r=" + radius + ")";
    }
}

class Triangle extends Shape {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        // Using Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle (sides=" + sideA + ", " + sideB + ", " + sideC + ")";
    }
}

class ShapeUtils {

    public static double getTotalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }

    public static double getTotalPerimeter(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getPerimeter();
        }
        return total;
    }

    public static Shape getLargestShape(List<Shape> shapes) {
        if (shapes.isEmpty()) return null;

        Shape largest = shapes.get(0);
        for (Shape shape : shapes) {
            if (shape.getArea() > largest.getArea()) {
                largest = shape;
            }
        }
        return largest;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(3));
        shapes.add(new Triangle(3, 4, 5));

        System.out.println("Total Area: " + ShapeUtils.getTotalArea(shapes));
        System.out.println("Total Perimeter: " + ShapeUtils.getTotalPerimeter(shapes));
        System.out.println("Largest Shape: " + ShapeUtils.getLargestShape(shapes));
    }
}
