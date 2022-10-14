package ss7_abstract_class_interface.exercise.InterfaceColorable.Shape;


public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Square(10);
        shape[1] = new Rectangle(10, 20);
        shape[2] = new Circle(10);
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();

            }
        }
    }
}