package ss7_abstract_class_interface.exercise.InterfaceColorable.Shape;

public class Rectangle extends Shape implements Colorable {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("hình chữ nhật : tô 4 cạnh");
    }
}