package randomAlgs;

public class JumpGameGreedyAlgorith {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;

        for(int i = 0; i < n; i++) {

            if(i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);

            if( maxReach >= n -1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println("Can jump to the end: " + canJump(nums1)); // Output: true
        int[] nums2 = {3,2,1,0,4};
        System.out.println("Can jump to the end: " + canJump(nums2)); // Output: false
    }
}
