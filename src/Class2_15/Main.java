package Class2_15;

import java.io.*;
import java.util.*;

public class Main {



    static void stack_push(Stack<Integer> stack, int j) {
        stack.push(j);
    }

    static void stack_pop(Stack<Integer> stack) {
        if(isEmpty(stack)) {
            System.out.println("Empty Stack");
            return;
        }
        Integer i = (Integer) stack.pop();
        System.out.println("Element removed: " + i);
    }

    static boolean isEmpty(Stack<Integer> stack) {
        if(stack.size() == -1) {
            return false;
        }
        return true;
    }

    static boolean isFull(Stack<Integer> stack) {
        for (Integer integer : stack) {
            if (integer == null) {
                return false;
            }
        }
        return true;
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer i = (Integer) stack.peek();
        System.out.println("Element on stack top: " + i);
    }

    static void stack_search(Stack<Integer> stack, int j) {
        Integer pos = (Integer) stack.search(j);
        if(pos == -1) {
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element found at position " + pos);
    }

    static void count(Stack<Integer> stack) {
        System.out.println(stack.size());
    }

    static void change(Stack<Integer> stack, int pos, int change) {
        stack.set(pos, change);
    }

    static void display(Stack<Integer> stack) {
        for (Integer integer : stack) {
            if (integer == null) {
                return;
            }
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        Stack.add(10);
        Stack.add(20);
        Stack.add(30);
        Stack.add(40);
        Stack.add(50);
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to Do?\n1 | Push\n2 | Pop\n3 | check isEmpty\n4 | check isFull()\n5 | Peek\n6 | Count\n7 | Change\n8 | Display\nInput: ");
        int in = input.nextInt(); input.nextLine();
        switch (in) {
            case 1:
                System.out.print("Input number to push: ");
                int i = input.nextInt(); input.nextLine();
                stack_push(Stack,i);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:

        }
    }



}
