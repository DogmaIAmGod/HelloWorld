package Search;
import java.util.LinkedList;
@SuppressWarnings("ALL")

public class DepthFirst {
    int Here;
    LinkedList[] adj;
    DepthFirst(int here) {
        Here = here;
        adj = new LinkedList[here];
        for (int i = 0; i < here; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int here, int there) {
        adj[here].add(there);
    }

    private void depthFirstSearchMain(int here, boolean[] visited) {
        visited[here] = true;
        System.out.print(here + " ");
        for (Object o : adj[here]) {
            int n = (int) o;
            if (!visited[n])
                depthFirstSearchMain(n, visited);
        }
    }

    public void depthFirstSearch(int here) {
        boolean[] visited = new boolean[Here];
        depthFirstSearchMain(here, visited);
    }
}
