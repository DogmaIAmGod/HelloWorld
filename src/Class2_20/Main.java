package Class2_20;

import java.util.Arrays;

public class Main {
    //bubble sort
    public static int[] bubbleSort(int[] a){
        int check = 0;
        while (check == 0) {
            int hit = 0;
            for (int i=0,j=1;i<a.length-1;i++) {
                if (a[i] > a[j]) {
                    int holdI = a[i];
                    int holdJ = a[j];
                    a[i] = holdJ;
                    a[j] = holdI;
                    hit = 1;
                }
                j++;

            }
            if (hit != 1) {
                check = 1;
            }
        }
        return a;
    }

    public static int[] bubbleCallSelf(int[] a) {
        int check = 0;
        for (int i=0,j=1;i<a.length-1;i++) {
            int holdI = a[i], holdJ = a[j];
            if (holdI > holdJ) {
                a[i] = holdJ;
                a[j] = holdI;
                check = 1;
            }
            j++;
        }
        if (check == 1) {
            bubbleCallSelf(a);
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

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        int[] c = {5, 1, 4, 2, 8};
        bubbleSort(a);
        bubbleCallSelf(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
        int[] b = {4,3,2,10,12};
        insertionSort(b);
        System.out.println(Arrays.toString(b));
    }
}
