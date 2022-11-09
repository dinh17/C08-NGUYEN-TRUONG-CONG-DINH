package ss12_collection_framework.exercise.product_management.controller;

import ss12_collection_framework.exercise.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenuProduct() {
        System.out.println("1. Thêm sản phẩm\n" +
                "2. Sửa thông tin theo id\n" +
                "3. Xóa sản phẩm theo id\n" +
                "4. Hiển thị danh sách sản phẩm\n" +
                "5. Tìm kiếm sản phẩm theo tên\n" +
                "6. Sắp xếp sản phâm tăng dần theo giá\n" +
                "7. Thoát chương trình");
        int choice;
        do {
            System.out.println("Nhập lựa chọn trong Menu Product: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductService.addProduct();
                    break;
                case 2:
                    ProductService.edit();
                    break;
                case 3:
                    ProductService.removeProduct();
                    break;
                case 4:
                    ProductService.displayListProduct();
                    break;
                case 5:
                    ProductService.search();
                    break;
                case 6:
                    ProductService.sortStudentByCost();

                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
        } while (true);

    }


}
