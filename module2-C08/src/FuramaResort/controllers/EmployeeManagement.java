package FuramaResort.controllers;

import java.util.Scanner;

public class EmployeeManagement extends FuramaController {

    public static void getEmployee() {
        System.out.println("" +
                "1 Display list employees\n" +
                "2 Add new employee\n" +
                "3 Delete employee\n" +
                "4 Edit employee\n" +
                "5 Return main menu");

        do {
            System.out.print("Nhập lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 5) {
                System.out.println("Nhập lựa chọn từ 1 đến 5 ");
            }
        } while (choice < 1 || choice > 5);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                displayMainMenu();
                break;
        }
    }
}
