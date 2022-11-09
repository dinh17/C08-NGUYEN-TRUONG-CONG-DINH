package baitapthicuoimodule2.controller;


import baitapthicuoimodule2.service.IService;
import baitapthicuoimodule2.service.impl.Service;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    IService service = new Service();
    public  void productController() throws IOException {
        System.out.println("--------Menu--------");
        System.out.println("01-AddProduct");
        System.out.println("02-RemoveProduct");
        System.out.println("03-SearchProduct");
        System.out.println("04-sort");
        System.out.println("05-edit");
        System.out.println("06-display");
        System.out.println("07-exit");
        System.out.println("Nhập lựa chọn của bạn");
        int number =0 ;
        do{
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number<0 || number>7){
                    System.out.println("nhập phần tử trong khoảng 1 - 7");
                }
 
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.out.println("nhập phần tử trong khoảng 1 - 7");
            }
        }while(number<0 || number>7);
        switch (number){
            case 1 :
                service.addProduct();
                service.displayListProduct();
                break;
            case 2 :
                service.removeProduct();
                service.displayListProduct();
                break ;
            case 3 :
                service.searchProduct();
                break ;
            case 4:
                service.sort();
                service.displayListProduct();
                break ;
            case 5 :
                service.edit();
                break ;
            case 6 :
                service.displayListProduct();
            case 7 :
                System.exit(0);
        }


    }


}
