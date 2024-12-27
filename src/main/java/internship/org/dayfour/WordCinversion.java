package internship.org.dayfour;

import java.util.Arrays;

public class WordCinversion {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create a 2D array to store the minimum edit distances
        int[][] dp = new int[m+1][n+1];

        // Initialize the first row and first column
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int[] row:dp) {
            System.out.println(Arrays.toString(row));
        }
        // Fill in the rest of the array using dynamic programming
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
                System.out.println(dp[i][j]+" @ "+i+" and "+j);
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        // String word1 = "madam";
        String word1 = "horse";
        // String word2 = "mam";
        String word2 = "ros";
        int result = minDistance(word1, word2);
        System.out.println("Minimum number of operations: " + result);
    }

}
