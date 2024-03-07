package Class2_20;

import java.util.LinkedList;

@SuppressWarnings("ALL")
public class BreathFirst {
    int Here;
    LinkedList[] adj;
    public BreathFirst(int here) {
        Here = here;
        adj = new LinkedList[here];
        for (int i = 0; i < here; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int here, int there) {
        adj[here].add(there);
    }

    public void breathFirstSearch(int here) {
        boolean[] visited = new boolean[Here];
        LinkedList<Integer> queue
                = new LinkedList<>();
        visited[here] = true;
        queue.add(here);

        while (!queue.isEmpty()) {
            here = queue.poll();
            System.out.print(here + " ");
            for (Object o : adj[here]) {
                int n = (int) o;
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
