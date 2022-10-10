package ss3_arrays_and_methods_in_Java.exercise;

import java.util.Arrays;

public class GroupArray {
    public static void main(String[] args) {
        int[] src1 = {28, 14, 35, 19};
        int[] src2 = {17, 40, 23};
        int[] dst = new int[src1.length + src2.length];

        System.arraycopy(src1, 0, dst, 0, src1.length);
        //(mảng cần cop,vị trí cop,cop đến mnangr nào,tại vị trí đến,cop bao nhiêu phần tử trong mảng cop )
        System.arraycopy(src2, 0, dst, src1.length, src2.length);

        System.out.println(Arrays.toString(dst));
    }
}
