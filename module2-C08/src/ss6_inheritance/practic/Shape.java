package ss6_inheritance.practic;

public class Shape {
    private static String color ;
    private static boolean filled  ;

    public Shape() {
        color ="green";
        filled = true ;
    }
    public Shape(String color, boolean filled){
        Shape.color = color ;
        Shape.filled = filled ;

    }

    public static void setFilled(boolean filled) {
        Shape.filled = filled;
    }

    public static void setColor(String color) {
        Shape.color = color;
    }

    public static String getColor() {
        return color;
    }

    public static boolean isFilled() {
        return filled;
    }

    public String toString() {

       return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
