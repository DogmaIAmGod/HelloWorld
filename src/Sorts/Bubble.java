package Sorts;

public class Bubble {
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
}
