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

        DepthFirst df = new DepthFirst(4);

        df.addEdge(0, 1);
        df.addEdge(0, 2);
        df.addEdge(1, 2);
        df.addEdge(2, 0);
        df.addEdge(2, 3);
        df.addEdge(3, 3);

        df.depthFirstSearch(2);

        System.out.println("\n");

        BreathFirst bf = new BreathFirst(4);

        bf.addEdge(0, 1);
        bf.addEdge(0, 2);
        bf.addEdge(1, 2);
        bf.addEdge(2, 0);
        bf.addEdge(2, 3);
        bf.addEdge(3, 3);

        bf.breathFirstSearch(2);
    }
}
