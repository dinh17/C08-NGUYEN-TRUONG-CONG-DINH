package ss3_arrays_and_methods_in_Java.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập vào một ký tự bất kỳ: ");
        char str1 = scanner.nextLine().charAt(0);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + str1 +
                " trong chuỗi " + str + " = " + count);
    }
}
