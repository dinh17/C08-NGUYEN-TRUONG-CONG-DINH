package ss6_inheritance.exercise.CircleAndCylinder;

public class Cylinder extends Circle {


    private static double height;


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        Cylinder.height = height;
    }


    public double getTotalArea() {
        return getArea() * height;
    }

    public String toString() {
        return getTotalArea() + "";
    }
}
