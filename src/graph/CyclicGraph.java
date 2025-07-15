package graph;

import java.util.ArrayList;

public class CyclicGraph {
    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i=0; i< graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }
//        graph[0].add(new Edge(0,2));
//
//        graph[1].add(new Edge(1,0));
//
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,0));

        graph[0].add(new Edge(0,1));

//        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,2));
    }

    public static boolean isCycleDetected(ArrayList<Edge>[] graph, boolean[] vis, int current, boolean[] rec) {
        vis[current] = true;
        rec[current] = true;
        for (int i=0; i< graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(rec[e.destination]) {
                return true;
            } else if(!vis[e.destination]){
                if(isCycleDetected(graph, vis, e.destination, rec)) {
                    return true;
                }
            }
        }
        rec[current] = false;
        return false;
    }
    public static void main(String[] args) {
        /*
        1   0
            |       3
            2
         */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean[] vis = new boolean[V];
        boolean[] rec = new boolean[V];
        for (int i=0; i< V; i++) {
            if(!vis[i]) {
                boolean isCycle = isCycleDetected(graph, vis, i, rec);
                System.out.println(isCycle);
                if(isCycle) {
                    break;
                }
            }
        }
    }
}
