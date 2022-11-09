package giai_thuat;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhập một số ");
       int  number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <number; i++) {
            if(!isPrime(i)){
                System.out.print(i+" ");
            }
        }


    }
    private static boolean isPrime (int number ){

        if(number==1 || number==0){
           return  false;
        }

        for (int i = 2; i <number ; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}