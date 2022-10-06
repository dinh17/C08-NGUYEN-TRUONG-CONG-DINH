package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * 23000;
        System.out.println("Số tiền VND là: " + vnd + "VND");
    }
}
