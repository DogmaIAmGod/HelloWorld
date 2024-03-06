package Userful;

public class HalfSearch {
    public static int halfSearch(int[] array, int target, int half, int bottom, int top) {
        boolean check = false;
        if(target < array[0] || target > array[array.length-1]) {
            return -1;
        }
        if(array[half] == target) {
            return half;
        }
        if(bottom + 1 == top || bottom - 1 == top) {
            return -1;
        }
        if(array[half] > target) {
           top = half;
           half = (bottom + top) / 2;
           check = true;
        }
        if(array[half] < target) {
            bottom = half;
            half = (bottom + top) / 2;
            check = true;
        }
        if (check) {
            return halfSearch(array,target,half, bottom, top);
        }
        return half;
    }
}
