package ss7_abstract_class_interface.exercise.InterfaceColorable.Shape;

public class Square extends Shape
        implements Colorable {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("hình vuông: tô 4 cạnh");
    }
}