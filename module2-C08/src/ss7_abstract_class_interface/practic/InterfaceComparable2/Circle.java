package ss7_abstract_class_interface.practic.InterfaceComparable2;

    public class Circle {
        private boolean filled= false ;
        private double radius = 1.0;
        private  String color ;

        public Circle() {
        }

        public Circle(double radius, String color, boolean filled) {
            this.color = color ;
            this.filled =filled;
            this.radius = radius;
        }

        public Circle(double radius ) {
            this.radius =radius ;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "filled=" + filled +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

