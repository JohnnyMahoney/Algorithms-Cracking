package randomAlgs;

import java.util.*;


class ListNodes {
    int value;
    int index;

    ListNodes(int value, int index) {
        this.index = index;
        this.value = value;
    }
}
public class K_MergeAlgorithm {

    public static List<Integer> mergeKLists(List<List<Integer>> lists) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<ListNodes> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.value));
        int[] pointers = new int[lists.size()];

        for(int i = 0; i < lists.size(); i++) {
            if(lists.get(i).size() > 0) {
                minHeap.add(new ListNodes(lists.get(i).get(0),i));
                pointers[i] = 1;
            }
        }

        while(!minHeap.isEmpty()) {
            ListNodes node = minHeap.poll();
            System.out.println("1 - " + node.index);
            System.out.println("2 - " + pointers[node.index]);
            System.out.println("3 - " + lists.get(node.index).size());

            result.add(node.value);
            if(pointers[node.index] < lists.get(node.index).size()) {
                minHeap.add(new ListNodes(lists.get(node.index).get(pointers[node.index]),node.index));
                pointers[node.index]++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1,4,5));
        lists.add(Arrays.asList(1,3,4));
        lists.add(Arrays.asList(2,6));

        List<Integer> mergedList = mergeKLists(lists);
        System.out.println(mergedList);


    }
}
