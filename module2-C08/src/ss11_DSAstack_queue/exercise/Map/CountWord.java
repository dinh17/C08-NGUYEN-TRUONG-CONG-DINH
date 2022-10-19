package ss11_DSAstack_queue.exercise.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {

    public void count() {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> map1 = new TreeMap<>();
        System.out.println("Nhập vào một chuỗi");
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        String key;
        int value;
        for (String s : array) {
            key = s;
            if (map1.containsKey(key)) {
                value = map1.get(key);
                map1.put(key, ++value);
            } else {
                map1.put(key, 1);
            }
        }
        System.out.println(map1);
    }
}
