package DSA.BackTracing;
import java.util.*;

public class SudokuSolver {
    
    public static void print(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] arr, int row, int column, int num) {
        int n = arr.length;
        
        // Check if the number is already present in the row or column
        for (int i = 0; i < n; i++) {
            if (arr[row][i] == num || arr[i][column] == num) {
                return false;
            }
        }
        
        // Check within the 3x3 subgrid
        int sqrt = (int) Math.sqrt(n);
        int boxRowStart = row - row % sqrt;
        int boxColStart = column - column % sqrt;
        
        for (int i = boxRowStart; i < boxRowStart + sqrt; i++) {
            for (int j = boxColStart; j < boxColStart + sqrt; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static boolean solveSudoku(int[][] arr) {
        int n = arr.length;

        // Find the first empty cell
        int row = -1;
        int column = -1;
        boolean isEmpty = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row = i;
                    column = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // If no empty cell is found, the puzzle is solved
        if (isEmpty) {
            return true;
        }

        // Try to place numbers from 1 to 9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(arr, row, column, num)) {
                arr[row][column] = num;

                // Recursively solve the rest of the puzzle
                if (solveSudoku(arr)) {
                    return true;
                } else {
                    // Backtrack
                    arr[row][column] = 0;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solveSudoku(sudoku)) {
            System.out.println("Sudoku Solved:");
            print(sudoku, sudoku.length);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
