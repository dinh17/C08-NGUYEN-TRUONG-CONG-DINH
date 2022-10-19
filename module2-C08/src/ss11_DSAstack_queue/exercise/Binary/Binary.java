package ss11_DSAstack_queue.exercise.Binary;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public void convert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bạn muốn chuyển:");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (number>0){
            stack.push(number%2);
            number /= 2;
        }
        String result = "";
        for (int i = 0; i < stack.size() ; i++) {
            result += stack.pop();
            i--;
        }
        System.out.println("Kết quả sau khi chuyển đổi là:"+ result);

    }
}
