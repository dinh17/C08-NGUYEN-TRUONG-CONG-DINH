package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {

    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void displayMainMenu() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management \n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");

        do {
            System.out.print("Nhập lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 6) {
                System.out.println("Nhập lựa chọn từ 1 đến 6 ( biết đọc không )");
            }
        } while (choice < 1 || choice > 6);
        switch (choice) {
            case 1:
                employeeManagement.displayMenu() ;
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                break;

        }
    }

}
