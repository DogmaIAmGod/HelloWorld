package Sorts;

import Userful.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = Random.generateRandomArray(20,1,30);
        Bubble.bubbleSort(a);
        System.out.println("Bubble: " + Arrays.toString(a));

        int[] b = Random.generateRandomArray(20,1,30);
        Insertion.insertionSort(b);
        System.out.println("Insertion: " + Arrays.toString(b));

        int[] c = Random.generateRandomArray(20,1,30);
        Quick.quickSort(c);
        System.out.println("Quick: " + Arrays.toString(c));

        int[] d  = Random.generateRandomArray(20,1,30);
        Merge.mergeSort(d,d.length);
        System.out.println("Merge: " + Arrays.toString(d));

    }
}
