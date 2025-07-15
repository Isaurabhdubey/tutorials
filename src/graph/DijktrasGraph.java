package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijktrasGraph {

    private static void createGraph(ArrayList<WeigtedEdge>[] graph) {
        for (int i=0; i< graph.length;i++) {
            graph[i] = new ArrayList<WeigtedEdge>();
        }

        graph[0].add(new WeigtedEdge(0,1, 2));
        graph[0].add(new WeigtedEdge(0,2, 4));

        graph[1].add(new WeigtedEdge(1,2, 1));
        graph[1].add(new WeigtedEdge(1,3, 7));

        graph[2].add(new WeigtedEdge(2,4, 3));

        graph[3].add(new WeigtedEdge(3,5, 1));

        graph[4].add(new WeigtedEdge(4,3, 2));
        graph[4].add(new WeigtedEdge(4,5, 5));
    }

    public static int printAllPath(ArrayList<WeigtedEdge>[] graph, boolean[] vis, int current, int weight, int target, int currentWeight){
        if(current == target) {
            if(currentWeight==-1) {
                currentWeight = weight;
                return currentWeight;
            } else if (currentWeight > weight) {
                currentWeight = weight;
                return currentWeight;
            }
            return currentWeight;
        }
        int w = -1;
        for (int i=0; i < graph[current].size(); i++) {
            WeigtedEdge e = graph[current].get(i);
            if(!vis[e.destination]) {
                vis[current]= true;
                w = printAllPath(graph, vis, e.destination, weight+e.weight, target, currentWeight);
                vis[current] = false;
            }
        }
        return w;
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void dijktra(ArrayList<WeigtedEdge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i=0; i<V; i++) {
            if(i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.remove();
            if(!vis[current.node]) {
                vis[current.node] = true;
                for (int i=0; i<graph[current.node].size(); i++) {
                    WeigtedEdge e = graph[current.node].get(i);
                    int u = e.source;
                    int v = e.destination;
                    if(dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0;i<V;i++) {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<WeigtedEdge>[] graph = new ArrayList[V];
        createGraph(graph);
//        boolean vis[] = new boolean[V];
//        int src = 0, target = 5;
//        System.out.println("Current "+printAllPath(graph, new boolean[V], src, 0,target, -1 ));
        dijktra(graph, 0, V);
    }
}

