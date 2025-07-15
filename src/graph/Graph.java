package graph;

import java.util.ArrayList;

public class Graph {
    static class Edge{
        int source;
        int destination;
        public Edge(int s, int d) {
            this.source = s;
            this.destination = d;
        }
    };

    private static void createGraph(ArrayList<Edge> graph[]) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }

    static void printNabours(int index, ArrayList<Edge>[] graph) {
        graph[index].forEach(edge -> System.out.println(edge.destination));
    }

    public static void main(String[] args) {
        int Vertices = 4;
        ArrayList<Edge> graph[] = new ArrayList[Vertices];
        createGraph(graph);
        printNabours(1, graph);
//        for (int i=0; i<graph[2].size(); i++) {
//            System.out.println(graph[2].get(i).destination);
//        }
    }
}
