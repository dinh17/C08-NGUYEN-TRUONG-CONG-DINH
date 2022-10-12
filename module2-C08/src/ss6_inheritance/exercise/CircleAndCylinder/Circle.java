package ss6_inheritance.exercise.CircleAndCylinder;

public class Circle {
    private static double radius;
    private static String color;


    public Circle(double radius, String color) {
        Circle.radius = radius;
        Circle.color = color;
    }

    public Circle() {
    }

    public static double getRadius() {
        return radius;
    }

    public static String getColor() {
        return color;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }


    public String toString() {
        return radius + "and" + getArea();
    }


}
