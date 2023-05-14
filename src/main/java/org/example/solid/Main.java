package org.example.solid;

public class Main {
    public static void main(String[] args) {
        printArea(new Circle(10));
        printArea(new Rectangle(10, 10));
    }

    public static void printArea(Shape shape) {
        double area = shape.getArea();
        System.out.println("Area : " + area);
    }
}
