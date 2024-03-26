package Sorts;

import Userful.UsefulRandom;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = UsefulRandom.generateRandomArray(20,1,30);
        Bubble.bubbleSort(a);
        System.out.println("Bubble: " + Arrays.toString(a));

        int[] b = UsefulRandom.generateRandomArray(20,1,30);
        Insertion.insertionSort(b);
        System.out.println("Insertion: " + Arrays.toString(b));

        int[] c = UsefulRandom.generateRandomArray(20,1,30);
        Quick.quickSort(c);
        System.out.println("Quick: " + Arrays.toString(c));

        int[] d  = UsefulRandom.generateRandomArray(20,1,30);
        Merge.mergeSort(d,d.length);
        System.out.println("Merge: " + Arrays.toString(d));

    }
}
