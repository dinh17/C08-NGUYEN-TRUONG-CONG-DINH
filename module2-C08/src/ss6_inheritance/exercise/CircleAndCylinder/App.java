package ss6_inheritance.exercise.CircleAndCylinder;

public class App {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle.setRadius(5);
        System.out.println("Area circle :" + circle.getArea());

        Cylinder cylinder = new Cylinder(Circle.getRadius(), Circle.getColor(), 10);

        System.out.println("Total is: " + cylinder.getTotalArea());
    }
}
