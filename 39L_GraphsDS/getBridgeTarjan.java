 //getBridgeTarjan
import java.util.*;

public class getBridgeTarjan {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create Graph
    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Edges
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    // DFS for Finding Bridges
    public static void bridgeDFS(
        ArrayList<Edge> graph[], 
        int curr, 
        int par,
        boolean vis[], 
        int dt[], 
        int low[], 
        int[] time) {

        vis[curr] = true;

        dt[curr] = low[curr] = ++time[0];

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (e.dest == par) {
                continue;
            }

            if (vis[e.dest]) {

                low[curr] = Math.min(low[curr], dt[e.dest]);

            } else {

                bridgeDFS(graph, e.dest, curr, vis, dt, low, time);

                low[curr] = Math.min(low[curr], low[e.dest]);

                if (dt[curr] < low[e.dest]) {
                    System.out.println("BRIDGE : " + curr + " --- " + e.dest);
                }
            }
        }
    }

    // Get Bridges
    public static void getBridge(ArrayList<Edge> graph[], int V) {

        int dt[] = new int[V];
        int low[] = new int[V];

        boolean vis[] = new boolean[V];

        int[] time = {0};

        System.out.println("Bridges in Graph:");

        for (int i = 0; i < V; i++) {

            if (!vis[i]) {
                bridgeDFS(graph, i, -1, vis, dt, low, time);
            }
        }
    }

    // DFS for Finding Articulation Points
    public static void articulationDFS(ArrayList<Edge> graph[], int curr, int par,
                                       boolean vis[], int dt[], int low[], int[] time,
                                       boolean isArticulation[]) {

        vis[curr] = true;

        dt[curr] = low[curr] = ++time[0];

        int child = 0;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (e.dest == par) {
                continue;
            }

            if (vis[e.dest]) {

                low[curr] = Math.min(low[curr], dt[e.dest]);

            } else {

                articulationDFS(graph, e.dest, curr, vis, dt, low, time,
                                isArticulation);

                low[curr] = Math.min(low[curr], low[e.dest]);

                if (dt[curr] <= low[e.dest] && par != -1) {
                    isArticulation[curr] = true;
                }

                child++;
            }
        }

        // Root vertex condition
        if (par == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }

    // Get Articulation Points
    public static void getArticulation(ArrayList<Edge> graph[], int V) {

        int dt[] = new int[V];
        int low[] = new int[V];

        boolean vis[] = new boolean[V];

        boolean isArticulation[] = new boolean[V];

        int[] time = {0};

        for (int i = 0; i < V; i++) {

            if (!vis[i]) {
                articulationDFS(graph, i, -1, vis, dt, low, time,
                                isArticulation);
            }
        }

        System.out.println("\nArticulation Points:");

        for (int i = 0; i < V; i++) {

            if (isArticulation[i]) {
                System.out.println(i);
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // Find Bridges
        getBridge(graph, V);

        // Find Articulation Points
        getArticulation(graph, V);
    }
}