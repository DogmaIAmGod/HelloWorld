package Class2_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
    public static int[] bubbleSort(int[] a) {
        boolean check = false;
        for (int i=0,j=1;i<a.length-1;i++) {
            int holdI = a[i];
            if (holdI > a[j]) {
                a[i] = a[j];
                a[j] = holdI;
                check = true;
            }
            j++;
        }
        if (check) {
            bubbleSort(a);
        }
        return a;
    }
    //insertion sort
    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int check = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > check) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = check;
        }
        return a;
    }

    static int partition(int[] array, int current, int end)
    {
//        System.out.print("\nPivot position: " + end + " | Current position: " + current + "\nPnum: " + array[end] + "\nCnum: " + array[current] + "\nArray: " + Arrays.toString(array) + "\n");
        int pivot = array[end], i = (current - 1);
        for (int j = current; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }
    static void quickSort(int[] array, int current, int end)
    {
        if (current < end) {
            int pi = partition(array, current, end);
            quickSort(array, current, pi - 1);
            quickSort(array, pi + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,13,14,14,11,3,10,6,9,14,12,11,5,6,8};
        /*
        bubbleSort(a);
        bubbleCallSelf(a);
        insertionSort(a);
        quickSort(a, 0, a.length-1);
         */

        System.out.println(Arrays.toString(a));
    }
}
