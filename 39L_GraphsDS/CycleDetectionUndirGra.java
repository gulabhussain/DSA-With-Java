//cycle detection in undirected graph using DFS
import java.util.*;

public class CycleDetectionUndirGra {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create Graph
    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // DFS Cycle Detection
    public static boolean isCyclicUtil(
            ArrayList<Edge>[] graph,
            boolean vis[],
            int curr,
            int par) {

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            // Case 1: If destination is visited and not parent
            if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // Case 2: If destination is parent, continue
            else if (e.dest == par) {
                continue;
            }

            // Case 3: If destination is not visited
            else {
                if (isCyclicUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Check Cycle in Graph
    // Time Complexity: O(V + E)
    public static boolean isCyclic(
            ArrayList<Edge>[] graph,
            boolean vis[]) {

        for (int i = 0; i < graph.length; i++) {

            if (!vis[i]) {
                if (isCyclicUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(isCyclic(graph, new boolean[V]));
    }
 
}
