package ss3_arrays_and_methods_in_Java.exercise;

import java.util.Arrays;
import java.util.Scanner;


public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mảng gồm n phần tử ");
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Nhập lại phần tử n lớn hơn 0");
            }

        } while (n <= 0);
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ arr" + "[" + i + "]= ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang ban dau:\n"+Arrays.toString(arr));
        System.out.println("Nhập số cần xoá");
        int numberNeedDelete = Integer.parseInt(scanner.nextLine());
//        List<Integer> list = new ArrayList<Integer>();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (numberNeedDelete == arr[i]) {
                     check=true;
                for (int k = i; k < n-1; k++) {
                    arr[k] = arr[k + 1];
                    arr[k + 1] = 0;
                }
               i--;
            }

        }
        if(!check){
            System.out.println("khong co so can tim");
        }else{
            System.out.println("Mảng sau khi xoá = " + Arrays.toString(arr));
        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] != numberNeedDelete){
//                list.add(arr[i]);
//            }
//        }
//
//        arr = list.toArray(new Integer[0]);




    }
}
