package Class2_27;

import java.util.Arrays;

public class Main {
    static int partition(int[] array, int current, int end)
    {
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
        int[] b = {4,10,8,7,6,5,3,12,14,2};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
