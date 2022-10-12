package ss6_inheritance.exercise.Point2DAnd3D;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        Point2D point2D = new Point2D(3,4);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }
}
