// cycle detection in directed graph using DFS

import java.util.*;
public class CycleDetectionDirGra {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Graph 1 - Cycle Exists (true)
    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    /*
    // Graph 2 - No Cycle (false)

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
    }
    */

    // DFS Cycle Detection
    public static boolean isCyclicUtil(
            ArrayList<Edge>[] graph,
            int curr,
            boolean vis[],
            boolean stack[]) {

        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            // Case 1: Cycle exists
            if (stack[e.dest]) {
                return true;
            }

            // Case 2: Destination is not visited
            else if (!vis[e.dest]) {

                if (isCyclicUtil(graph, e.dest, vis, stack)) {
                    return true;
                }
            }
        }

        stack[curr] = false;

        return false;
    }

    // Check Cycle in Directed Graph
    // Time Complexity: O(V + E)
    public static boolean isCyclic(ArrayList<Edge>[] graph) {

        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            if (vis[i] == false) {

                boolean cycle = isCyclicUtil(
                        graph,
                        i,
                        vis,
                        new boolean[vis.length]
                );

                if (cycle) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.println(isCyclic(graph));
    }    
    
}
