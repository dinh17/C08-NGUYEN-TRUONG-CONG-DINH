package FuramaResort.controllers;

public class BookingManagement extends FuramaController {
    public static void getBooking() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Return main menu");

        do {
            System.out.print("Nhập lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 3) {
                System.out.println("Nhập lựa chọn từ 1 đến 6 ( biết đọc không )");
            }
        } while (choice < 1 || choice > 3);
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                displayMainMenu();
                break;
        }
    }
}
