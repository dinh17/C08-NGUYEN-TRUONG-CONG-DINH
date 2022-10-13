package ss7_abstract_class_interface.exercise.InterfaceResizeable;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10) + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize((int) Math.floor(Math.random() * 100) + 1);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
