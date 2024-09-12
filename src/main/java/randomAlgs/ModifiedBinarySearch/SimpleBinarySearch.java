package randomAlgs.ModifiedBinarySearch;

public class SimpleBinarySearch {
    public static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = binarySearch(nums, 9);
        System.out.println(result);
    }
}
