package randomAlgs.K_way;

public class MergeSorted {

    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;

        for (int p = nums1.length-1; p>=0; p--) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            }
            else {
                nums1[p] = nums2[p2];
                p2--;
            }
            if (p1 < 0) {
                p--;
                while(p2 >= 0) {
                    nums1[p] = nums2[p2];
                    p2--;
                    p--;
                }
                break;
            }
            if (p2 < 0) {
                p--;
                while(p1 >= 0) {
                    nums1[p] = nums1[p1];
                    p1--;
                    p--;
                }
                break;
            }
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        int[] list = mergeSorted(nums1, 3, nums2, 3);

        for (int element: list) {
            System.out.println(element);
        }
    }
}
