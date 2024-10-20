package randomAlgs.Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int result = 1;
        int part = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1] + 1)) {
                part += 1;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else
                part = 1;
            if (part > result)
                result = part;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 20, 4, 10, 3, 4, 5};
        int[] nums2 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};

        int result = longestConsecutive(nums2);
        System.out.println(result);
    }
}
