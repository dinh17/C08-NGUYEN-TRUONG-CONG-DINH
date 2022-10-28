package ss17_binary_file_and_serialization.exercise.controller;


import ss17_binary_file_and_serialization.exercise.service.ProductManagement;

import java.util.Scanner;

public class ProductController   {
    public static void displayMenuProduct() {
        int choice;
        do {
            System.out.println("=========Menu=========\n" +
                    "1.\tThêm sản phẩm\n" +
                    "2.\tHiển thị sản phẩm\n" +
                    "3.\tTìm kiếm thông tin sản phẩm\n" +
                    "4.\tThoát\n" +
                    "*****Nhập vào lựa chọn của bạn*****");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductManagement.addProduct();
                    ProductManagement.writeFile();
                    break;
                case 2:
                    ProductManagement.displayList();
                    break;
                case 3:
                    ProductManagement.searchInfor();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng lựa chọn hệ thống cung cấp");
            }
        } while (true);

    }
}
