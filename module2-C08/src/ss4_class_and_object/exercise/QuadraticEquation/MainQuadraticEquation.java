package ss4_class_and_object.exercise.QuadraticEquation;


import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1:");
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the number2:");
        double number2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the number3:");
        double number3 = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(number1, number2, number3);
        if (number1 == 0) {
            if (number2 == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-number3 / number2));
            }
        }
        else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println(quadraticEquation.getRoot1() + "and" + quadraticEquation.getRoot2());
        }

    }



}
