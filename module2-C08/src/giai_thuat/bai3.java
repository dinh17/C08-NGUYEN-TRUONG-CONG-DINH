package giai_thuat;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            if (isPrime(i) && checkFib(i)) {
                System.out.print(i + " ");
            }
        }

    }
    private static boolean checkFib(int number) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        while (num1 < number) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (number ==  num1) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPrime(int number) {

        if (number == 1 || number == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
