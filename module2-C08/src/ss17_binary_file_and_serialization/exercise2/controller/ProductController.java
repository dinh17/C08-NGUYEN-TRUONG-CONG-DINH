package ss17_binary_file_and_serialization.exercise2.controller;

import ss17_binary_file_and_serialization.exercise2.service.impl.Service;
import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    public static void productController() throws IOException {
        System.out.println("-------------Menu----------------");
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Search");
        System.out.println("4.Exit");
        System.out.println("5.Display");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phù hợp với phương thức cần thực hiện");
        int number;
        do {

            number = Integer.parseInt(scanner.nextLine());
            if (number < 1 || number >5) {
                System.out.println("Nhập lại số trong phạm vi [1-3]");
            }
            switch (number){
                case 1 :
                    Service.add();

                    break ;

                case 2 :
                    break ;

                case 3 :
                    break ;
                case 4
                        :
                    break ;
                case 5 :
                    break ;

            }
        }
        while (true);


    }
}
