package internship.org.dayfour;

import java.util.Arrays;

public class Checkers {
    public static int maxCellsCaptured(int[][] gameBoard) {
        int row = gameBoard.length;
        int column = gameBoard[0].length;
        int[][] maheshCaptured = new int[row][column];
        int[][] sureshCaptured = new int[row][column];
        
        // mahesh check down and right direction from the current
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                if (gameBoard[i][j] == 1) {
                    maheshCaptured[i][j] = 1 + Math.max(
                            i + 1 < row ? maheshCaptured[i + 1][j] : 0,
                            j + 1 < column ? maheshCaptured[i][j + 1] : 0
                    );
                    //System.out.println("Mahesh Captured @ "+i+" and "+j+" are "+maheshCaptured[i][j]);
                }
            }
        }
        // suresh check up and left direction from the current
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (gameBoard[i][j] == 1) {
                    sureshCaptured[i][j] = 1 + Math.max(
                            i - 1 >= 0 ? sureshCaptured[i - 1][j] : 0,j - 1 >= 0 ? sureshCaptured[i][j - 1] : 0
                    );
                }
            }
        }
        for(int[] currentRow:maheshCaptured){
            System.out.println(Arrays.toString(currentRow));
        }
        for(int[] currentRow:sureshCaptured){
            System.out.println(Arrays.toString(currentRow));
        }
        return Math.min(maheshCaptured[0][0], sureshCaptured[0][0]);
    }

    public static void main(String[] args) {
        // int[][] grid = {
        //     {1, 0, 1, 0, 1},
        //     {1, 1, 0, 1, 1},
        //     {0, 1, 0, 1, 0},
        //     {0, 1, 1, 1, 0},
        //     {1, 0, 1, 0, 1}
        // };
        int[][] grid = {
            {0, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int result = maxCellsCaptured(grid);
        System.out.println("Result: " + result);
    }

}
