package graph;

import java.util.ArrayList;

public class WeightedGraph {
    static class Edge {
        int source;
        int destination;
        int weight;
        Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }
    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i=0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,-1));
        graph[3].add(new Edge(3,2,0));

    }

    private static void printNabour(int index, ArrayList<Edge>[] graph) {
        graph[index].forEach(edge -> System.out.println(edge.destination + " -> " + edge.weight));
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        printNabour(2, graph);
    }
}
