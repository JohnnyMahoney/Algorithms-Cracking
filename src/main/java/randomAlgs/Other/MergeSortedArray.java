package randomAlgs.Other;

public class MergeSortedArray {
    static int[] num1 ={1,2,3,0,0,0};
    static int[] num2 ={2,5,6};
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //make one list
        for (int i = 0; i<n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        bubbleSort(nums1);
    }
    public static void bubbleSort(int[]nums){

        int n = nums.length;
        boolean swapped;
        for(int i = 0; i < n-1; i++){
            swapped = false;
            for(int j  = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
    merge(num1,3, num2,3);

        for (int i: num1) {
            System.out.println(i + "");
        }
    }

}
