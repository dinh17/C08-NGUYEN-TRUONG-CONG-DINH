package ss5_access_modifier_static_method_static_property.exercise.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        display(circle1);
        // Test constructor has 1 parameter radius
        Circle circle2 = new Circle(2.0);
        display(circle2);
        // Test constructor has 2 parameter radius, color
        Circle circle3 = new Circle(2.0, "blue");
        display(circle3);
        // Test getter setter
        Circle circle4 = new Circle();
        circle4.setColor("Green");
        circle4.setRadius(3.0);
        display(circle4);
    }
    public static void display(Circle circle) {
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println();
    }


}
