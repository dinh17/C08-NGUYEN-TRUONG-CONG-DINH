package ss12_collection_framework.exercise.product_management.model.service;

import ss12_collection_framework.exercise.product_management.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập price: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());
        int id = productList.get(productList.size() - 1).getId() + 1;
        Product product = new Product(nameProduct, priceProduct);
        product.setId(id);
        productList.add(product);
        displayListProduct();
    }

    public static void displayListProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void removeProduct() {
        int deletedIndex = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                deletedIndex = i;
            }
        }
        if (deletedIndex != -1) {
            productList.remove(deletedIndex);
        } else {
            System.out.println("Không tìm thấy id này. ");
        }
        displayListProduct();
    }

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String nameProduct = scanner.nextLine();
        boolean check = false;
        int count = 0;
        for (Product product : productList) {
            if (nameProduct.equals(product.getProductName())) {
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

    public static void sortStudentByGPA() {
        productList.sort(new SortStudentByCost());
    }

    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập price: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());

        boolean isExisted = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                isExisted = true;
                product.setId(id);
                product.setProductName(nameProduct);
                product.setCost(priceProduct);

                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            displayListProduct();
        }

    }

    public static ArrayList<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product("Định", 1000, 1);
        Product product2 = new Product("Tài", 2000, 2);
        Product product3 = new Product("Nghĩa", 1500, 3);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    }
}

