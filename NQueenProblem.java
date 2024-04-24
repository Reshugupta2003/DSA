package DSA.BackTracing;

public class NQueenProblem {

    public static void printBoard(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int arr[][], int row, int column, int n) {
        int i, j;

        // Check for queens in the same row to the left
        for (i = 0; i < column; i++) {
            if (arr[row][i] == 1) {
                return false;
            }
        }
        // Check upper diagonal on the left side
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        // Check lower diagonal on the left side
        for (i = row, j = column; i < n && j >= 0; i++, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean solveQueen(int arr[][], int column, int n) {
        // Base case - if all queens are placed
        if (column >= n) {
            return true;
        }

        // Consider this column and try to put the queen in each row of this column
        for (int i = 0; i < n; i++) {
            // Check if it's safe to place the queen in this row and column
            if (isSafe(arr, i, column, n)) {
                // Place the queen
                arr[i][column] = 1;

                // Recur to place rest of the queens
                if (solveQueen(arr, column + 1, n)) {
                    return true;
                }
                // If placing queen in this position doesn't lead to a solution, backtrack
                arr[i][column] = 0;
            }
        }
        // If no row in this column leads to a solution, return false
        return false;
    }
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0},
                         {0, 0, 0, 0}};

        if (solveQueen(board, 0, board.length)) {
            printBoard(board, board.length);
        }
         else {
            System.out.println("Solution does not exist");
        }
    }
}
