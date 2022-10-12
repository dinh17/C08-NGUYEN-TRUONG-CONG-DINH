package ss7_abstract_class_interface.practic.InterfaceComparable2;


import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        return Double.compare(c1.getRadius(), c2.getRadius());
    }
}
