package baitapthicuoimodule2.service.impl;

import baitapthicuoimodule2.model.Product;
import baitapthicuoimodule2.service.IService;
import baitapthicuoimodule2.until.Sort;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static baitapthicuoimodule2.until.WriteRead.readFile;
import static baitapthicuoimodule2.until.WriteRead.writeFile;

public class Service implements IService {
    static Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        List<Product> productList = null;
        try {
            productList = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập Hãng");
        String hang = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, nameProduct, hang, price);
        productList.add(product);
        try {
            writeFile(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //---------------------------------------------------------------------------------------
    public  void displayListProduct() {
        try {
            for (Product item : readFile()) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-----------------------------------------------------------------------------------------
    public  void removeProduct() {
        List<Product> productList = null;
        try {
            productList = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index = -1;
        System.out.println("Nhập id phần tử cần xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                index = i;

            }
        }
        if (index == -1) {
            System.out.println("không tìm thấy id");
        } else {
            productList.remove(index);
            try {
                writeFile(productList);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //--------------------------------------------------------------------------------------------
    public  void searchProduct() {
        boolean check = false;
        List<Product> productList = null;
        try {
            productList = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập id sản phẩm cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println(p);
                check = true;
            }
        }
        if (!check) {
            System.out.println("không tồn tại");
        }


    }
//--------------------------------------------------------------------------------------------------

    public  void sort()  {
        List<Product> productList = null;
        try {
            productList = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        productList.sort(new Sort().reversed());
        try {
            writeFile(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//-------------------------------------------------------------------------------------------------
    public  void edit() {
        List<Product> productList = null;
        try {
            productList = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập hãng");
        String hang = scanner.nextLine();
        System.out.println("Nhập price: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());

        boolean isExisted = false;
        for (Product product: productList) {
            if (product.getId() == id) {
                isExisted = true;
                product.setId(id);
                product.setNameProduct(nameProduct);
                product.setPrice(priceProduct);
                product.setHang(hang);
                try {
                    writeFile(productList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            displayListProduct();
        }

    }

}
