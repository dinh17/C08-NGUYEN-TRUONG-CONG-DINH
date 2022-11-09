package giai_thuat;

import java.util.Arrays;

//2. Viết 1 hàm nhận vào 1 mảng các số nguyên.
//        Đếm số lần xuất hiện của các phần tử trong mảng
//        đó. Ví dụ:
//        [ 1,2,3,3,2,4] => 1 : 1 lần , 2 : 2 lần, 3: 2 lần, 4: 1
//        lần.
public class bai2 {
    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(visited));   
            if (visited[i])
                continue;

            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String []args)
    {
        int[] arr = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;
        countFreq(arr, n);
    }
}


