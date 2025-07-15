package dynamicProgramming;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int tempArray[][] = new int[m][n];
        for(int i=0;i < m; i++) {
            for(int j=0; j < n; j++) {
                if(i==0 || j == 0) {
                    tempArray[i][j] = 1;
                } else {
                    tempArray[i][j] = tempArray[i-1][j]+ tempArray[i][j-1];
                }
            }
        }
        return tempArray[m-1][n-1];
    }

    public static int findUniqPaths(int m, int n) {
        if (m==1 || n==1) {
            return 1;
        }
        return findUniqPaths(m-1, n)+ findUniqPaths(m, n-1);
    }

    static int numberOfPaths(int m, int n) {

        int dp[][] = new int[m][n];

        // Count of paths to reach any cell in
        // first column is 1
//        for (int i = 0; i < m; i++)
//            dp[i][0] = 1;
//
//        // Count of paths to reach any cell in
//        // first row is 1
//        for (int j = 0; j < n; j++)
//            dp[0][j] = 1;

        // Calculate count of paths for other
        // cells in bottom-up manner using
        // the recursive solution
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (i==0 || j==0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
        }
        return dp[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int res = uniquePaths(2, 5);
//        int res2 = uniquePaths(3, 7);
        System.out.println(res);
//        System.out.println(res2);
        int m = 3, n=7;
        int m1 = 1, n1 = 2;
        int matrix = 3-1, coumn = 7-2;
        int res2 = uniquePaths(matrix, coumn);
        System.out.println(res2);
    }
}
