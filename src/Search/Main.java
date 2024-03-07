package Search;
import Sorts.Quick;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {13, 18, 22, 12, 19, 10, 6, 1, 14, 3};
        int[] b = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        Linear.linearSearch(a,19);

        Quick.quickSort(a);

        System.out.println(Binary.binarySearch(a, 6,(a.length/2),0,a.length));
        System.out.println(Binary.binarySearch(b, 16,(b.length/2),0,b.length));
    }
}
