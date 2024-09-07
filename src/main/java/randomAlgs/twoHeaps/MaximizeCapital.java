package randomAlgs.twoHeaps;


import java.util.PriorityQueue;

public class MaximizeCapital {
    public static int maximumCapital(int c, int k, int[] capitals, int[] profits) {
        int n = capitals.length;
        int currentCapital = c;

        PriorityQueue<int[]> capitalMinHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < capitals.length; i++) {
            capitalMinHeap.offer(new int[]{capitals[i], i});
        }

        PriorityQueue<int[]> profitsMaxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        while (k != 0) {
            while (!capitalMinHeap.isEmpty() && capitalMinHeap.peek()[0] <= currentCapital) {
                int[] j = capitalMinHeap.poll();
                profitsMaxHeap.offer(new int[]{profits[j[1]]});
            }
            if (profitsMaxHeap.isEmpty()) {
                break;
            }
            int x = profitsMaxHeap.poll()[0];
            currentCapital += x;
            k--;
        }
        return currentCapital;
    }

    public static void main(String[] args) {
        int[] capital = {4, 5, 6, 1, 3};
        int[] profit = {3, 4, 5, 1, 2};
        int result = maximumCapital(3, 2, capital, profit);
        System.out.println(result);
    }
}