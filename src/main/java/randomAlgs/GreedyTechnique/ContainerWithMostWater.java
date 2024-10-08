package randomAlgs.GreedyTechnique;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int minValue = Math.min(height[leftPointer], height[rightPointer]);
            if (maxArea < (rightPointer - leftPointer) * minValue)
                maxArea = (rightPointer - leftPointer) * minValue;

            if (height[leftPointer] < height[rightPointer])
                leftPointer++;
            else
                rightPointer--;
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println(result);
    }
}
