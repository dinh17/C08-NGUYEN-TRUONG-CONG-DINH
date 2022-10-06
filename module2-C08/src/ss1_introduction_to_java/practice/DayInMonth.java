package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ban muon biet thang nao ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngay ");
                break;

//            if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
//            else System.out.print("Invalid input!");
        }
    }

}
