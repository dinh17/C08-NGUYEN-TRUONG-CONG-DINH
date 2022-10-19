package ss11_DSAstack_queue.exercise.Reserver;

import java.util.Stack;

public class ReserverStack {

    static void stackOfIStrings() {
        String input = "hnid  gnoc";
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }

        System.out.println("Stack sau khi đảo " + stack1);
    }

    static void stackOfIntegers() {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("stack ban đầu" + stack);
        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        System.out.println("Stack sau khi đảo " + stack1);

    }
}
