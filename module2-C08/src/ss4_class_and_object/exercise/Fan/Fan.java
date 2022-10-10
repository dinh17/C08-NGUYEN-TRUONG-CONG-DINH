package ss4_class_and_object.exercise.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public Fan() {

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        if (this.on) {
            return "Fan{" + ", speed=" + speed + ", on=" + ", color='" + color + '\'' + ", radius=" + radius + "fan is on" + '}';
        } else {
            return "Fan{" + ", speed=" + speed + ", on=" + ", color='" + color + '\'' + ", radius=" + radius + "fan is off" + '}';
        }
    }

}
