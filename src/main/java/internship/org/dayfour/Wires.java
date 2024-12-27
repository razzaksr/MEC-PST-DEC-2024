package internship.org.dayfour;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Wires {
    // O(n)
    public static int minimumCostToAssembleWiresDP(int[] wires) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int wire : wires) {
            pq.offer(wire);
        }
        System.out.println("Current PQ "+pq);
        int totalCost = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            System.out.println(first+" "+second);
            int cost = first + second;
            System.out.println(cost);
            totalCost += cost;
            pq.offer(cost);
            System.out.println("Iterated PQ "+pq);
        }
        return totalCost;
    }
    // Greedy: O(n2)
    public static int minimumCostToAssembleWires(int[] wires) {
        int n = wires.length;
        Arrays.sort(wires); // Sort the wires in ascending order
        int totalCost = 0;
        System.out.println(Arrays.toString(wires));
        while (n > 1) {
            int cost = wires[0] + wires[1]; // Merge the two shortest wires
            totalCost += cost;
            wires[1] = cost; // Replace second element with merged wire
            // Shift remaining elements to the left
            for (int i = 2; i < n; i++) {wires[i - 1] = wires[i];}
            System.out.println(Arrays.toString(wires)+" "+totalCost);
            n--; // Decrease the number of wires
        }
        System.out.println(Arrays.toString(wires));
        return totalCost;
    }

    public static void main(String[] args) {
        // Sample inputs and outputs
        int[][] sampleInputs = {
            {1, 1, 6, 6, 7, 8},
            {2, 3, 4, 5},
            {10, 20, 30},
            {5, 5, 5, 5},
            {9, 8, 7, 6}
        };

        for (int[] wires : sampleInputs) {
            System.out.println("Wires: " + Arrays.toString(wires));
            // int minCost = minimumCostToAssembleWires(wires);
            int minCost = minimumCostToAssembleWiresDP(wires);
            System.out.println("Minimum cost to assemble all gold wires: " + minCost + "\n");
        }
    }
}
