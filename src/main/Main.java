package main;

import implementation.StackImplementation;

public class Main {
    public static void main(String[] args) {
        StackImplementation<Integer> stack = new StackImplementation<>();

        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(2);

        while(!stack.isEmpty()) System.out.println(stack.pop());
    }
}
