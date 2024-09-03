package randomAlgs.twoPointers;

public class twoSum {

    //Using the two-pointer tecnique
    // if   sum of two == - return, else if sum < target - start++, else sum > target - end--
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if ((arr[start] + arr[end]) == target) {
                result[0] = start;
                result[1] = end;
                return result;
            } else if ((arr[start] + arr[end]) < target) {
                start++;
            } else
                end--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = twoSum(array, 8);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
