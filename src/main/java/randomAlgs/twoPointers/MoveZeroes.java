package randomAlgs.twoPointers;

public class MoveZeroes {
    int[] arr = {0, 1, 0, 3, 12};

    public static void moveZeroes(int[] nums) {
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero] = nums[i];
                nonZero++;
            }
        }

        for (int i = nonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes instance = new MoveZeroes();
        moveZeroes(instance.arr);
        for (int var : instance.arr) {
            System.out.println(var);
        }
    }
}
