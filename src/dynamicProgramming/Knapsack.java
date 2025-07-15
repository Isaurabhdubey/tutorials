package dynamicProgramming;

import java.util.Arrays;

public class Knapsack {
    static int[][] newarr= new int[100][100];
    public static int knapsackSolution(int[] wt, int[] val, int W, int n) {
        if(n==0 || W==0) {
            return 0;
        }
        if(newarr[n][W] !=-1) {
            return newarr[n][W];
        }
        if(wt[n-1]<=W) {
            newarr[n][W] = Math.max(val[n-1]+ knapsackSolution(wt, val, W-wt[n-1], n-1), knapsackSolution(wt,val, W, n-1));
            return newarr[n][W];
        } else {
            newarr[n][W] = knapsackSolution(wt, val, W, n-1);
            return newarr[n][W];
        }
    }
    public static void main(String[] args) {
        int[] wt = new int[]{1,3,5};
        int[] val = new int[]{1,4,5};
        int W = 7;
        for (int i=0; i<newarr.length; i++) {
            Arrays.fill(newarr[i], -1);
        }
        int maxWeight = knapsackSolution(wt, val, W, wt.length);
        System.out.println(maxWeight);
    }
}
