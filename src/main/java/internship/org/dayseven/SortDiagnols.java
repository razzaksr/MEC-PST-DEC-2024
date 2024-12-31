package internship.org.dayseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDiagnols {
        public static void main(String[] args) {
        int[][] mat1 = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };
        int[][] result1 = diagonalSort(mat1);
        printMatrix(result1);

        int[][] mat2 = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };
        int[][] result2 = diagonalSort(mat2);
        printMatrix(result2);
    }

    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // Sort diagonals starting from the first row
        for (int col = 0; col < n; col++) {
            sortDiagonal(mat, 0, col);
        }
        // Sort diagonals starting from the first column
        for (int row = 1; row < m; row++) {
            sortDiagonal(mat, row, 0);
        }
        return mat;
    }

    private static void sortDiagonal(int[][] mat, int row, int col) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> diagonal = new ArrayList<>();

        int r = row, c = col;
        // Collect the diagonal elements
        while (r < m && c < n) {
            diagonal.add(mat[r][c]);
            r++;
            c++;
        }

        // Sort the diagonal elements
        Collections.sort(diagonal);

        // Place the sorted elements back in the matrix
        r = row;
        c = col;
        int index = 0;
        while (r < m && c < n) {
            mat[r][c] = diagonal.get(index++);
            r++;
            c++;
        }
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
