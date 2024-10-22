package randomAlgs.Arrays_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElementsInList {

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i : nums) {
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(frequency.entrySet());
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 3, 3};
        int[] result = topKFrequent(nums, 2);

        for (int i : result) {
            System.out.println(i + "");
        }
    }
}
