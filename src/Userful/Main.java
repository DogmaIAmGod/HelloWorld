package Userful;

import Sorts.Quick;

public class Main {
    public static void main(String[] args) {
        int[] a = {13, 18, 22, 12, 19, 10, 6, 1, 14, 3};
        int[] b = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Quick.quickSort(a);
        System.out.println(HalfSearch.halfSearch(a, 6,(a.length/2),0,a.length));
        System.out.println(HalfSearch.halfSearch(b, 16,(b.length/2),0,b.length));
    }
}
