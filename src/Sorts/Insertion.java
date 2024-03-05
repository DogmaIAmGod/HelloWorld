package Sorts;

public class Insertion {
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
}
