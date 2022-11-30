package baitapthicuoimodule.util;

import java.util.Scanner;



public class Regex {
    private static final String PHONE_NUMBER = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
    private static final String MAIL = "\\w+@(gmail|codegym).com";
    private  static final String SEX = "female|male";
    static Scanner scanner = new Scanner(System.in);

    public static String emai() {

        String text;
        do {
            text = scanner.nextLine();
            if(!text.matches(MAIL)) {
                System.out.println("Nhập lại");
            }
        }while(!text.matches(MAIL));
         return text;
    }
    public static String phone() {

        String text;
        do {
            text = scanner.nextLine();
            if(!text.matches(PHONE_NUMBER)) {
                System.out.println("Nhập lại");
            }
        }while(!text.matches(PHONE_NUMBER));
        return text;

    }
    public static String sex(){
        String text;
        do {
            text = scanner.nextLine();
            if(!text.matches(SEX)) {
                System.out.println("Nhập lại");
            }
        }while(!text.matches(SEX));
        return text;
    }


}

