package randomAlgs.Other;

import java.util.Arrays;

public class SumOfThreeValues {
    public static boolean findSumOfThreeWithoutSorting(int[] nums, int target) {
        int n = nums.length;;

        for(int i = 0; i < n-2; i++) {
            for(int j = i +1; j < n-1; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        System.out.println("the target value found");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean findSumOfThreeWithSorting(int[] nums, int target) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2;i++){
            int left = i + 1;
            int right = nums.length -1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    System.out.println("triplet found");
                    return true;
                } else if (sum<target) {
                    left++;
                    
                }else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {11,7,1,2,40,4,5};
        findSumOfThreeWithSorting(arr, 56);
    }
}
