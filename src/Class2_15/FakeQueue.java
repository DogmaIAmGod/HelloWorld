package Class2_15;

import java.util.Arrays;
import java.util.Scanner;
public class FakeQueue {
    Integer[] fakeQueue;
    FakeQueue(Integer[] fq) {
        fakeQueue = fq;
    }

    public Integer[] enqueue(int i) {
        Integer[] a = new Integer[this.fakeQueue.length+1];
        for(int j=0;j<this.fakeQueue.length;j++) {
            a[j] = this.fakeQueue[j];
        }
        a[a.length-1] = i;
        System.out.println(Arrays.toString(a));
        return a;
    }

    public Integer[] dequeue() {
        boolean check = this.isEmpty();
        if(!check) {
            Integer[] a = new Integer[this.fakeQueue.length-1];
            System.out.println("Value dequeued: " + fakeQueue[0]);
            for(int j=1,h=0;j<a.length+1;j++) {
                a[h] = this.fakeQueue[j];
                h++;
            }
            System.out.println(Arrays.toString(a));
            return a;
        }

        System.out.println(Arrays.toString(this.fakeQueue));
        return this.fakeQueue;
    }

    public boolean isEmpty() {
        for(int i=0;i<this.fakeQueue.length;i++) {
            if (fakeQueue[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for(int i=0;i<this.fakeQueue.length;i++) {
            if (fakeQueue[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void peek(int pos) {
        boolean check = this.isEmpty();
        if(!check) {
            System.out.println(fakeQueue[pos]);
            return;
        }
        System.out.println("Empty");

    }

    public void count() {
        int count = 0;
        for(int i=0;i<this.fakeQueue.length;i++) {
            if (fakeQueue[i] != null) {
                count++;
            }
        }
        System.out.println(count);
    }

    public Integer[] change(int pos, int change) {
        try {
            this.fakeQueue[pos] = change;
            return this.fakeQueue;
        } catch (Exception e) {
            System.out.println(e);
        }
        return  fakeQueue;
    }

    public void display() {
        System.out.println(Arrays.toString(fakeQueue));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] fakeQueue = {};  boolean check; int num;
        FakeQueue fQueue = new FakeQueue(fakeQueue);
        System.out.print("What would you like to Do?\n1 | Enqueue\n2 | Denqueue\n3 | check isEmpty\n4 | check isFull()\n5 | Peek\n6 | Count\n7 | Change\n8 | Display\nInput: ");
        int in = input.nextInt(); input.nextLine();
        while (in < 9) {

            if (in == 1) {
                System.out.print("Input number to push: ");
                num = input.nextInt(); input.nextLine();
                fQueue.fakeQueue = fQueue.enqueue(num);
            }
            if (in == 2) {
                fQueue.fakeQueue = fQueue.dequeue();
            }
            if (in == 3) {
                check = fQueue.isEmpty();
                System.out.println(check);
            }
            if (in == 4) {
                check = fQueue.isFull();
                System.out.println(check);
            }
            if (in == 5) {
                System.out.print("Input position to peek at: ");
                num = input.nextInt(); input.nextLine();
                fQueue.peek(num);
            }
            if (in == 6) {
                fQueue.count();
            }
            if (in == 7) {
                System.out.print("Input position of number to change: ");
                int num1 = input.nextInt(); input.nextLine();
                System.out.print("Input new value: ");
                int num2 = input.nextInt(); input.nextLine();
                fQueue.fakeQueue = fQueue.change(num1, num2);
            }
            if (in == 8) {
                fQueue.display();
            }
            System.out.print("What would you like to Do?\n1 | Enqueue\n2 | Denqueue\n3 | check isEmpty\n4 | check isFull()\n5 | Peek\n6 | Count\n7 | Change\n8 | Display\nInput: ");
            in = input.nextInt(); input.nextLine();
        }
    }
}
