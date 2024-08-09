package randomAlgs;

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

    public static void main(String[] args) {
        int[] arr = {3,7,1,2,8,4,5};
        findSumOfThreeWithoutSorting(arr, 17);
    }
}
