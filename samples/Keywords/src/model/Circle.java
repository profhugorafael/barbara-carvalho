package model;

public class Circle {

    public static final double PI = 3.14;

    private String color;
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*PI*radius;
    }

    // toString

    @Override
    public String toString() {
        return """
        Circle{
            color='$color',
            radius=$radius
        }""";
    }
}