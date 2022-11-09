package ss14_sort_algorithm.practic;

public class BubbleSort {

        static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++)
            for (int j = 0; j < n - i-1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

        public static void main(String[] args) {
            bubbleSort(list);
            for (int value : list) System.out.print(value + " ");
        }

}
