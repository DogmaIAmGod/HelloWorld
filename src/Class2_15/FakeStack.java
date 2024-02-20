package Class2_15;

import java.util.Arrays;
import java.util.Scanner;
public class FakeStack {

    Integer[] fakeStack;
    FakeStack(Integer[] fs) {
        fakeStack = fs;
    }

    public Integer[] push(int i) {
        Integer[] a = new Integer[this.fakeStack.length+1];
        for(int j=0;j<this.fakeStack.length;j++) {
            a[j] = this.fakeStack[j];
        }
        a[a.length-1] = i;
        return a;
    }

    public Integer[] pop() {
        boolean check = this.isEmpty();
        if(!check) {
            Integer[] a = new Integer[this.fakeStack.length-1];
            System.out.println("Value popped: " + fakeStack[fakeStack.length-1]);
            for(int j=0;j<a.length;j++) {
                a[j] = this.fakeStack[j];
            }
            return a;
        }
        return this.fakeStack;
    }

    public boolean isEmpty() {
        for(int i=0;i<this.fakeStack.length;i++) {
            if (fakeStack[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for(int i=0;i<this.fakeStack.length;i++) {
            if (fakeStack[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void peek(int pos) {
        boolean check = this.isEmpty();
        if(!check) {
            System.out.println(fakeStack[pos]);
            return;
        }
        System.out.println("Empty");

    }

    public void count() {
        int count = 0;
        for(int i=0;i<this.fakeStack.length;i++) {
            if (fakeStack[i] != null) {
                count++;
            }
        }
        System.out.println(count);
    }

    public Integer[] change(int pos, int change) {
        try {
            this.fakeStack[pos] = change;
            return this.fakeStack;
        } catch (Exception e) {
            System.out.println(e);
        }
        return  fakeStack;
    }

    public void display() {
        System.out.println(Arrays.toString(fakeStack));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] fakeStack = {};  boolean check; int num;
        FakeStack fStack = new FakeStack(fakeStack);

        System.out.print("What would you like to Do?\n1 | Enqueue\n2 | Denqueue\n3 | check isEmpty\n4 | check isFull()\n5 | Peek\n6 | Count\n7 | Change\n8 | Display\nInput: ");
        int in = input.nextInt(); input.nextLine();
        while (in < 9) {

            if (in == 1) {
                System.out.print("Input number to push: ");
                num = input.nextInt(); input.nextLine();
                fStack.fakeStack = fStack.push(num);
            }
            if (in == 2) {
                fStack.fakeStack = fStack.pop();
            }
            if (in == 3) {
                check = fStack.isEmpty();
                System.out.println(check);
            }
            if (in == 4) {
                check = fStack.isFull();
                System.out.println(check);
            }
            if (in == 5) {
                System.out.print("Input position to peek at: ");
                num = input.nextInt(); input.nextLine();
                fStack.peek(num);
            }
            if (in == 6) {
                fStack.count();
            }
            if (in == 7) {
                System.out.print("Input position of number to change: ");
                int num1 = input.nextInt(); input.nextLine();
                System.out.print("Input new value: ");
                int num2 = input.nextInt(); input.nextLine();
                fStack.fakeStack = fStack.change(num1, num2);
            }
            if (in == 8) {
                fStack.display();
            }
            System.out.print("What would you like to Do?\n1 | Enqueue\n2 | Denqueue\n3 | check isEmpty\n4 | check isFull()\n5 | Peek\n6 | Count\n7 | Change\n8 | Display\nInput: ");
            in = input.nextInt(); input.nextLine();
        }
    }
}
