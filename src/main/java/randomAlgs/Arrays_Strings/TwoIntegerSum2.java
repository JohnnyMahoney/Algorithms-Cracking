package randomAlgs.Arrays_Strings;

public class TwoIntegerSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else
                right--;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] result = twoSum(arr, 3);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
