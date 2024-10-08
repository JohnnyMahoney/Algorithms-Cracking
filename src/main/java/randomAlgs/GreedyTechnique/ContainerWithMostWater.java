package randomAlgs.GreedyTechnique;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxValue = 0;

        while (start < end) {
            int minValue = Math.min(height[start], height[end]);
            if (maxValue < (end - start) * minValue)
                maxValue = (end - start) * minValue;

            if (minValue == height[start])
                start++;
            else
                end--;
        }
        return maxValue;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println(result);
    }
}
