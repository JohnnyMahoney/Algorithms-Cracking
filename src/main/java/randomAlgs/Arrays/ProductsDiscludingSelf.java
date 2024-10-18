package randomAlgs.Arrays;

public class ProductsDiscludingSelf {

    //Time Complexity - O(n^2)
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int j = 0;
        int value = 1;
        while (j < result.length) {
            for (int i = 0; i < nums.length; i++) {
                if (j == i)
                    continue;
                value *= nums[i];
            }
            result[j] = value;
            value = 1;
            j++;
        }
        return result;
    }

    //Time Complexity - O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = postfix * result[i];
            postfix = postfix * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf2(arr);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
