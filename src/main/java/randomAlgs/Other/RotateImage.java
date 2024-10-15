package randomAlgs.Other;

public class RotateImage {
    static int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    //Space Complexity O(n^2)
    //Time Complexity O(n^2)
    public static int[][] rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                newMatrix[j][matrix.length - 1 - i] = matrix[i][j];
                System.out.println(newMatrix[j][matrix.length - 1 - i]);
            }
        }
        return newMatrix;
    }

    //Space Complexity O(1)
    //Time Complexity O(n^2)
    public static void rotate2(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
                currentState(matrix);
            }
        }
    }

    public static void currentState(int[][] matrix) {
        for (int[] i : matrix) {
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        rotate2(matrix);
        currentState(matrix);
    }
}
