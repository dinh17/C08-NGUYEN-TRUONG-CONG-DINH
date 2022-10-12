package ss5_access_modifier_static_method_static_property.exercise.AccessModifier;

public class Circle {

    private static double radius ;
    private static String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        Circle.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        Circle.radius = radius;
        Circle.color = color;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }

    public void setColor(String color) {
        Circle.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Radius: " + radius + " - Color: " + color;
    }

}
