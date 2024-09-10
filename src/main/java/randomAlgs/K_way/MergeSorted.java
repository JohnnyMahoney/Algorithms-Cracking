package randomAlgs.K_way;

public class MergeSorted {

    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1 -= 1;
            }
            else {
                nums1[p] = nums2[p2];
                p2 -= 1;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int[] list = mergeSorted(nums1, 3, nums2, 3);

        for (int element: list) {
            System.out.println(element);
        }
    }
}
