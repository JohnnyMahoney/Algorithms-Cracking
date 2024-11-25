package randomAlgs.BinarySearch;

public class BinarySearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                int middle = end + (start - end) / 2;
                if (matrix[i][middle] == target)
                    return true;
                else if (matrix[i][middle] > target) {
                    end = middle - 1;
                } else
                    start = middle + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 4, 8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        };

        boolean res = searchMatrix(matrix, 10);
        System.out.println(res);

    }
}
