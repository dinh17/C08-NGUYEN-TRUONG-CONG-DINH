package ss4_class_and_object.exercise.Fan;

public class MainFan {
    public static void main(String[] args) {
//        Fan fan1 = new Fan(3, true, "Yellow", 10);
//        Fan fan2 = new Fan(2, false, "Blue", 5);
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan2.setRadius(10);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("Blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        System.out.println(fan1 + " và " + fan2);

    }

}
