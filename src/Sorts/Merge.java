package Sorts;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge {

    public static void mergeSort(int[] array, int len) {
        if(len<2) {
            return;
        }

        int mid = len/2;
        int[] l = new int[mid];
        int[] r = new int[len - mid];

        for(int i=0;i<mid;i++) {
            l[i] = array[i];
        }

        for(int i=mid;i<len;i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l,mid);
        mergeSort(r,len - mid);
        merge(array, l, r, mid, len - mid);
    }

    public static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }

        while (i < left) {
            array[k++] = l[i++];
        }

        while (j < right) {
            array[k++] = r[j++];
        }
    }
}
