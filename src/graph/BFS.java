package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge{
        int source;
        int destination;
        Edge(int s, int d) {
            this.source = s;
            this.destination = d;
        }
    }

    private static void bfsTravelsal(ArrayList<Edge>[] graph, int V, boolean[] vis, int startIndex){
        Queue<Integer> q= new LinkedList<>();
        q.add(startIndex);
        while (!q.isEmpty()) {
            int current = q.remove();
            if(vis[current] == false) {
                System.out.println(current + " ");
                vis[current] = true;
                for (int i=0;i<graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    q.add(e.destination);
                }
            }
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        for (int i=0;i<vis.length; i++) {
            if(vis[i]== false) {
                bfsTravelsal(graph, V, vis, i);
            }
        }
    }
}
