package Sorts;

import Userful.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = Random.generateRandomArray(20,1,9999);
        Bubble.bubbleSort(a);
        System.out.println(Arrays.toString(a));

        int[] b = Random.generateRandomArray(20,1,9999);
        Insertion.insertionSort(b);
        System.out.println(Arrays.toString(b));

        int[] c = Random.generateRandomArray(20,1,9999);
        Quick.quickSort(c);
        System.out.println(Arrays.toString(c));

        int[] d  = Random.generateRandomArray(20,1,9999);
        Merge.mergeSort(d,d.length);
        System.out.println(Arrays.toString(d));

    }
}
