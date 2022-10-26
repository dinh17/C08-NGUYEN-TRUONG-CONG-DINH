package ss14_sort_algorithm.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Your input array: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(array);

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                System.out.println("thực thi : "+Arrays.toString(array));
                j = j - 1;
            }

            array[j + 1] = key;
        }
        System.out.println(" kết quả " + Arrays.toString(array));
    }

}