package dynamicProgramming;

import java.util.Arrays;

public class KnapsackTopDown {
    public static int knapsackSolution(int[] wt, int[] val, int weight, int n) {
        int[][] tempArray = new int[n+1][weight+1];
        for (int i=0; i< n+1; i++) {
            for (int j=0; j< weight+1; j++) {
                if(i==0 || j== 0) {
                    tempArray[i][j] = 0;
                } else if(wt[i-1]<= j) {
                    tempArray[i][j] = Math.max(val[i-1]+ tempArray[i-1][j-wt[i-1]], tempArray[i-1][j]);
                } else {
                    tempArray[i][j] = tempArray[i-1][j];
                }
            }
        };
        return tempArray[n][weight];
    }
    public static void main(String[] args) {
        int[] wt = new int[]{1,4, 3,5};
        int[] val = new int[]{1,8, 4,5};
        int W = 7;
        int maxWeight = knapsackSolution(wt, val, W, wt.length);
        System.out.println(maxWeight);
    }
}
