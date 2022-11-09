package ss17_binary_file_and_serialization.exercise.service;


import ss17_binary_file_and_serialization.exercise.model.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product(1, "1280", "NoKia", 500, "no");
        Product product2 = new Product(2, "1281", "NoKia2", 700, "no");
        Product product3 = new Product(3, "1282", "NoKia3", 900, "no");
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public static void writeFile(List<ss17_binary_file_and_serialization.exercise2.model.Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Codegym\\C08-NGUYEN-TRUONG-CONG-DINH\\module2-C08\\src\\ss17_binary_file_and_serialization\\exercise\\data\\data.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void addProduct() {
        Product product = new Product();
        System.out.println("Nhập vào thông tin sản phẩm");
        System.out.println("Mã sản phẩm:");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Tên sản phẩm:");
        product.setName(scanner.nextLine());
        System.out.println("Hãng sản xuất:");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Gía:");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Các mô tả khác:");
        product.setDescribe(scanner.nextLine());
        products.add(product);

    }

    public static void displayList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void searchInfor() {
//        System.out.println("Nhập mã sản phẩm cần tìm");
//        int id = Integer.parseInt(scanner.nextLine());
//        for (Product product : products) {
//            if (product.getId() == id) {
//                System.out.println(product);
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy sản phẩm");

        System.out.println("Nhập nameProduct: ");
        String nameProduct = scanner.nextLine();
        boolean check = false;
        int count = 0;
        for (Product product : products) {
            if (nameProduct.equals(product.getName())) {
                check = true;
                count++;
            }

        }
        if (!check) {
            System.out.println("Không tồn tại tên sản phẩm");
        } else {
            System.out.println("có " + count + " sản phẩm tên " + nameProduct);

        }
    }
}