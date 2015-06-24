//for dp question, most important part is state equation.
public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int maxSize = 0, pre = 0;
        int dp[] = new int[m + 1];
        for(int j = 0; j < n; j ++)
            for (int i = 1; i <= m; i++) {
                int temp = dp[i];
                if (matrix[i - 1][j] == '1'){
                    dp[i] = Math.min(dp[i],Math.min(dp[i - 1],pre)) + 1;
                    maxSize = Math.max(dp[i], maxSize);
                }
                else dp[i] = 0;
                pre = temp;
            } 
        return maxSize * maxSize;
    }
}