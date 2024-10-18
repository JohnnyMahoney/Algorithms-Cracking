package randomAlgs.Arrays;

public class ProductsDiscludingSelf {

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

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int[] result = productExceptSelf(arr);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
