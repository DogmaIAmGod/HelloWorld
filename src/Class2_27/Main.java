package Class2_27;

import Userful.UsefulRandom;

import java.util.Arrays;

public class Main {

    static void quickSort(int[] array) {
        qS(array, 0, array.length - 1);
    }

    static void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    static int partition(int[] array, int l, int r, int pivot) {
        while (l <= r) {
            while (array[l] < pivot) {
                l++;
            }

            while (array[r] > pivot) {
                r--;
            }

            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }
        return l;
    }

    static void qS(int[] array, int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            int pivot = array[mid];
            int index = partition(array, s, e, pivot);
            qS(array, s, index - 1);
            qS(array, index, e);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,13,14,14,11,3,6,9,14,12,11,5,6,8,7};
        int[] b = UsefulRandom.generateRandomArray(100,1,9999);
        String[] c = UsefulRandom.generateRandomArray(100);
        String[] d = UsefulRandom.generateRandomWords(10);
        quickSort(a);
        quickSort(b);
        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(d));
    }
}
