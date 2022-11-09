package FuramaResort.controllers;

public class CustomerManagement extends FuramaController {

    public static void disCustomer(){
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");

        do {
            System.out.print("Nhập lựa chọn của bạn ");
            choice = Integer.parseInt(scanner.nextLine());
            if(choice<1 || choice>4){
                System.out.println("Nhập lựa chọn từ 1 đến 6 ( biết đọc không )");
            }
        }while(choice< 1 ||choice>4);
        switch (choice){
            case 1 :
                break ;
            case 2 :
                break ;
            case 3 :
                break ;
            case 4 :
                break ;
        }
    }
}
