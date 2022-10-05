package introduction_to_java.practice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] argv) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width ");
        width = scanner.nextFloat();
        System.out.println("enter height ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
