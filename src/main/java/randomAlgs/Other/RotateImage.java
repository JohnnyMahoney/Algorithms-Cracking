package randomAlgs.Other;

public class RotateImage {
    static int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

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


    public static void main(String[] args) {
        int[][] result = rotate(matrix);
        for (int[] i : matrix) {
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        for (int[] i : result) {
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
