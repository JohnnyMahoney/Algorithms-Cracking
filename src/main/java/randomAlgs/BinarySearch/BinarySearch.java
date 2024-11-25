package randomAlgs.BinarySearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = end + (start - end) / 2;
            if (nums[middle] == target)
                return middle;
            else if (nums[middle] > target) {
                end = middle - 1;
            } else
                start = middle + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 2, 4, 6, 8};
        int result = search(nums, 4);
        System.out.println(result);
    }
}
