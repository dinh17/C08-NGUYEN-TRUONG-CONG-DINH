package ss17_binary_file_and_serialization.exercise2.service.impl;

import ss17_binary_file_and_serialization.exercise2.model.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


import static ss17_binary_file_and_serialization.exercise2.until.WriteAndRead.writeFile;
import static ss17_binary_file_and_serialization.exercise2.until.WriteAndRead.readFile;

public class Service {
    public static void add () throws IOException {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id,name,price);
        List<Product> productList = readFile();
        productList.add(product);
        writeFile(productList);
    }
    public static void display() throws IOException {
        for (Product list : readFile()) {
            System.out.println(list);
        }
    }
}
