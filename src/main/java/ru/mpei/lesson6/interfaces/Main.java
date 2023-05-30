package ru.mpei.lesson6.interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        double circleArea = circle.calculateArea();
        System.out.println("circleArea = " + circleArea);
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("circlePerimeter = " + circlePerimeter);
        System.out.println("\n");

        Rectangle rectangle = new Rectangle(2, 4);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("rectangleArea = " + rectangleArea);
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("rectanglePerimeter = " + rectanglePerimeter);
        System.out.println("\n");
    }
}
