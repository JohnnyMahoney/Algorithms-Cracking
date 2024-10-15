package randomAlgs.Other;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];
                System.out.println(value);

                if (board[i][j] == '.')
                    continue;
                if (!(isRowValid(board, i, j) && isColValid(board, i, j) && isSubgridValid(board, i, j)))
                    return false;
            }
        }
        return true;
    }

    public static boolean isRowValid(char[][] board, int row, int col) {
        char value = board[row][col];
        for (int k = 0; k < 9; k++) {
            System.out.println(board[row][k]);
            if (k != col && board[row][k] == value)
                return false;
        }
        return true;
    }

    public static boolean isColValid(char[][] board, int row, int col) {
        char value = board[row][col];
        for (int k = 0; k < 9; k++) {
            System.out.println(board[k][col]);
            if (k != row && board[k][col] == value)
                return false;
        }
        return true;
    }

    public static boolean isSubgridValid(char[][] board, int row, int col) {
        char value = board[row][col];
        int subgridRowStart = (row / 3) * 3;
        int subgridColStart = (col / 3) * 3;
        System.out.println(subgridColStart);
        System.out.println(subgridRowStart);

        for (int i = subgridRowStart; i < subgridRowStart + 3; i++) {
            for (int j = subgridColStart; j < subgridColStart + 3; j++) {
                if ((i != row || j != col) && board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        char[][] sudoku = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean result = isValidSudoku(sudoku);
        System.out.println(result);
    }
}
