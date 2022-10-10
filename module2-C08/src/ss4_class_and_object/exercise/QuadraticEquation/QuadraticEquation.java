package ss4_class_and_object.exercise.QuadraticEquation;

public class QuadraticEquation {
    double number1, number2, number3;

    public QuadraticEquation(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double getDiscriminant() {
        return this.number2 * 2 - 4 * this.number1 * this.number3;
    }

    public double getRoot1() {
        return (-this.number2 + Math.pow((this.number2 * this.number2 - 4 * this.number1 * this.number3), 0.5)) / 2 * this.number1;
    }

    public double getRoot2() {
        return (-this.number2 - Math.pow((this.number2 * this.number2 - 4 * this.number1 * this.number3), 0.5)) / 2 * this.number1;
    }

}
