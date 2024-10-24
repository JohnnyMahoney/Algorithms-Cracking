package randomAlgs.realInterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ServerNetworkOptimization {

    //Prim's algorithm
    //Tik Tok assesment - Optimizing a Network of Servers Located on a Grid

    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static int getMinServerNetworkCost(List<Integer> x, List<Integer> y) {
        int n = x.size();

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        boolean[] isIncluded = new boolean[n];
        int totalCost = 0;
        int edgesUsed = 0;

        pq.add(new Edge(0, 0));

        while (edgesUsed < n && !pq.isEmpty()) {
            Edge current = pq.poll();
            int server = current.node;
            int cost = current.weight;

            if (isIncluded[server]) continue;

            totalCost += cost;
            isIncluded[server] = true;
            edgesUsed++;

            for (int i = 0; i < n; i++) {
                if (!isIncluded[i]) {
                    int weight = Math.min(Math.abs(x.get(server) - x.get(i)), Math.abs(y.get(server) - y.get(i)));
                    pq.add(new Edge(i, weight));
                }
            }

        }
        return totalCost;
    }

    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(1, 10, 6, 3);
        List<Integer> y = Arrays.asList(2, 10, 12, 3);

            int result = getMinServerNetworkCost(x, y);
        System.out.println("Мінімальна вартість мережі серверів: " + result);
    }
}
