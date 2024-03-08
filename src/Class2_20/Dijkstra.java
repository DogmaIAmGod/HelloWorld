package Class2_20;
import java.util.*;

public class Dijkstra {
    public static void shortestLength(int startValue, Node startNode, Node endNode, Edge[] edges) {
        Node currentNode = startNode;
        startNode = whereToGo(startNode,endNode,edges);
       for(Edge edge : edges) {
           if(edge.node2 == currentNode && edge.node1 == startNode) {
                   startValue += edge.weight;
                   System.out.println(edge.weight);
           }
       }

       if(startNode == endNode) {
           System.out.println(startValue);
           return;
       }
       shortestLength(startValue,startNode,endNode,edges);

    }

    public static Node whereToGo(Node currentNode,Node endNode, Edge[] edges) {
        ArrayList<Edge> canGo = new ArrayList<>();
        Node whereToGo = null;
        int compare = Integer.MAX_VALUE;
        for (Edge edge : edges) {
            if (edge.node2 == currentNode) {
                canGo.add(edge);
            }
        }

        for (Edge ed : canGo) {
            System.out.println(ed.node1.name + " <- " + ed.node2.name);
        }
        System.out.println("\n");

        for (Edge com : canGo) {
            if(com.weight < compare) {
                compare = com.weight;
            }

            if(com.node1 == endNode) {
                whereToGo = com.node1;
                return whereToGo;
            }
        }


        for (Edge edge : canGo) {
            if(edge.weight == compare) {
                whereToGo = edge.node1;
            }
        }

        return whereToGo;
    }


    public static void main(String[] args) {

        Node s = new Node("s");
        Node y = new Node("y");
        Node t = new Node("t");
        Node x = new Node("x");
        Node z = new Node("z");
        Edge s_t = new Edge(s, t, 10);
        Edge t_x = new Edge(t, x, 1);
        Edge s_y = new Edge(s, y, 5);
        Edge y_t = new Edge(y, t, 3);
        Edge t_y = new Edge(t, y, 2);
        Edge y_z = new Edge(y, z, 2);
        Edge y_x = new Edge(y, x, 9);
        Edge z_s = new Edge(z, s, 7);
        Edge x_z = new Edge(x, z, 4);
        Edge z_x = new Edge(z, x, 6);
        Edge[] edges = {s_t,t_x,s_y,y_t,t_y,y_z,y_x,z_s,x_z,z_x};
        shortestLength(0,x,s,edges);




    }
}


