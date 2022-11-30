package baitapthicuoimodule.controller;

import baitapthicuoimodule.service.IService;
import baitapthicuoimodule.service.impl.Service;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    Scanner  scanner = new Scanner(System.in);
    public void controller() throws IOException {
        System.out.println("-------Menu--------");
        System.out.println("01.Adđ");
        System.out.println("02.Remove");
        System.out.println("03.Edit");
        System.out.println("04.Search");
        System.out.println("05.Display");
        System.out.println("06.Exit");
        System.out.println("Nhập lựa chọn của bạn");
        int number=0 ;
        IService service = new Service();
        do{

            try{
                number  = Integer.parseInt(scanner.nextLine());
                if(number<0 || number>6){
                    System.out.println("Nhập lại số nguyên dương");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("nhập lại số nguyên dương");
            }

        }while(number<0 || number>6);
        switch(number){
            case 1 :
              service.addStudent();
              service.displayStudent();
                break;
            case 2 :
                break ;
            case 3 :
                break ;
            case 4 :
                break;
            case 5 :
                break ;
            case 6 : System.exit(0);
        }
    }

}
