package randomAlgs.GreedyTechnique;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int result = 0;
        int left = 0;;

        for (int i = 0; i < height.length-1; i++) {
            int right = findBiggerValue(i, height);

            if (right == 0) {
                break;
            }

            if (right == left + 1) {
                left = right;
                continue;
            }
            if (height[right] >= height[left]) {
                int blocks = calculateBlocks(left, right, height);
                result += height[left] * (right - left-1) - blocks;
            } else {
                right = findMaxValue(i + 1, height);
                if (right == left + 1) {
                    left = right;
                    continue;
                }
                int blocks = calculateBlocks(left, right, height);
                result += height[right] * (right - left) - blocks;
            }
            left = right;
            i = right-1;
        }
        return result;
    }

    public static int findBiggerValue(int a, int[] height) {
        for (int i = a + 1; i < height.length; i++) {
            if (height[i] >= height[a])
                return i;
        }
        return 0;
    }

    public static int calculateBlocks(int a, int b, int[] height) {
        int result = 0;
        for (int i = a + 1; i < b; i++) {
            if (height[i] > 0) {
                result += height[i];
            }
        }
        return result;
    }

    public static int findMaxValue(int a, int[] height) {
        int maxValue = height[a];
        int index = a;
        for (int i = a+1; i < height.length; i++) {
            if (height[i] > maxValue) {
                maxValue = height[i];
                index =  i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] height = {4,2,3};
        int result = trap(height);
        System.out.println(result);
    }
}
