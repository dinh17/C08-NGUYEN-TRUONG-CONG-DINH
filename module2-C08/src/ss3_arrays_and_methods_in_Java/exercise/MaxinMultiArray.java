package ss3_arrays_and_methods_in_Java.exercise;


import java.util.Scanner;

public class MaxinMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2;
        do{
        System.out.println("Nhập vào độ dài của mảng");
         number1 = Integer.parseInt(scanner.nextLine());
         if(number1<0){
             System.out.println("Nhập lại độ dài của mảng lớn hơn  0");
         }
        } while(number1<0);
        do{
            System.out.println("Nhập vào độ dài phần tử  của mảng");
            number2 = Integer.parseInt(scanner.nextLine());
            if(number2<0){
                System.out.println("Nhập lại độ dài phẩn tử mảng mảng lớn hơn  0");
            }
        } while(number2<0);
            int[][] arr = new int[number1][number2];
            int max=0 ;
        for (int i = 0; i <number1 ; i++) {
            for (int j = 0; j <number2 ; j++) {
                System.out.print("Nhập phần tử của mảng tại vị trí thứ arr=["+i+"]["+j+"]:");
                arr[i][j]=Integer.parseInt(scanner.nextLine());
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        System.out.println("Số lớn nhất trong mảng là  "+max);
    }
}
