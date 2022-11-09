package ss14_sort_algorithm.exercise;

public class Test {
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
