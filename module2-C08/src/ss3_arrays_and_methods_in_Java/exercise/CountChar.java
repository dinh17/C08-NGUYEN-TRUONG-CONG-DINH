package ss3_arrays_and_methods_in_Java.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String str;
        char str1 = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + str1 +
                " trong chuỗi " + str + " = " + count);
    }
}
