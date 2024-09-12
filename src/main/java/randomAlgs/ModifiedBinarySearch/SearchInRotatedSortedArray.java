package randomAlgs.ModifiedBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInRotatedSortedArray {

    public static int binarySearchRotated(List<Integer> nums, int target) {
        int start = 0;
        int end = nums.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // not to reach the Integer limit

            if (nums.get(mid) == target)
                return mid;
            if (nums.get(start) <= nums.get(mid)) {
                if (nums.get(start) <= target && target < nums.get(mid)) {
                    end = mid - 1;
                } else start = mid + 1;
            } else {
                if (target > nums.get(mid) && target <= nums.get(end)) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7);
        int result = binarySearchRotated(list, 5);
        System.out.println(result);
    }
}
