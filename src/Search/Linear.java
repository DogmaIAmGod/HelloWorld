package Search;

public class Linear {
    public static void linearSearch(int[] array, int target) {
        for(int i=0; i<array.length;i++) {
            if(array[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
