package randomAlgs.TopK_Elements;

import java.util.PriorityQueue;

public class Kth_largest_element {

    public PriorityQueue<Integer> topKHeap;
    public int k;

    public Kth_largest_element(int k, int[] nums) {
        this.k = k;
        topKHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    // adds element in the topKHeap
    public int add(int val) {
        if (topKHeap.size() < k) {
            topKHeap.offer(val);
        } else {
            if (topKHeap.peek() < val) {
                topKHeap.poll();
                topKHeap.offer(val);

            }
        }
        return topKHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 4, 12, 15, 16};
        Kth_largest_element kthLargestElement = new Kth_largest_element(6, arr);
        System.out.println(kthLargestElement.topKHeap.peek());
    }
}
