package randomAlgs.MergeIntervals;

import java.util.Arrays;

public class MergeIntervals {

    /*
        The array should be sorted for operation, otherwise use Array.sort - nLogn operations
        Space complexity - O(1)
        Time Complexity - O(n) - iterate over all array
     */
    public static int[][] mergeIntervals(int[][] intervals) {
        int index = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }

        return Arrays.copyOf(intervals, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {{2, 4}, {3, 5}, {4, 5}, {6, 10}, {12, 14}};

        int[][] mergedIntervals = mergeIntervals(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
