package randomAlgs.BinarySearch;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] <= nums[end] || nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        } else {
            while (start < end) {
                int middle = start + (end - start) / 2;
                if (middle > 0 && nums[middle] < nums[middle - 1]) {
                    return nums[middle];
                } else if (nums[middle] > nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle;
                }

            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1};

        int result = findMin(nums);
        System.out.println(result);

    }
}
