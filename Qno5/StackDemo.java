package Qno5;

import java.util.Stack;

public class StackDemo {

    Stack<Integer> stack = new Stack<>();

    void pushElement(int n) {
        stack.push(n);
        System.out.println(n + " pushed");
    }

    void popElement() {
        if(!stack.isEmpty())
            System.out.println("Popped: " + stack.pop());
        else
            System.out.println("Stack is empty");
    }

    void checkEmpty() {
        System.out.println("Is Empty: " + stack.isEmpty());
    }

    public static void main(String[] args) {

        StackDemo obj = new StackDemo();

        obj.pushElement(10);
        obj.pushElement(20);

        obj.popElement();
        obj.checkEmpty();
    }
}
