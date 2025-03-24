package Baitap1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    //Constructor
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Method
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban kinh:");
        radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Mau sac: ");
        color = scanner.nextLine();
    }

    public void displayData() {
        System.out.println(toString());
        System.out.println("Dien tich: " + area());
        System.out.println("Chu vi: " + perimeter());
    }

    public String toString() {
        return "Circle[radius= " + radius + ", color= " + color + "]";
    }
}