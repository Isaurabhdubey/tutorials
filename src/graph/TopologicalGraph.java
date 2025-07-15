package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalGraph {

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }


        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    private static void topSortUtil (ArrayList<Edge>[] graph, boolean[] vis, int current, Stack<Integer> stack) {
        vis[current] = true;
        for (int i=0; i< graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!vis[e.destination]) {
                topSortUtil(graph, vis, e.destination, stack);
            }
        }
        stack.push(current);
    }
    public static void main(String[] args) {
        int V= 6;
        boolean[] vis = new boolean[V];
        ArrayList<Edge>[] graph = new ArrayList[V];
        Stack<Integer> stack = new Stack<>();
        createGraph(graph);
        for (int i=0; i< vis.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, vis, i, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
