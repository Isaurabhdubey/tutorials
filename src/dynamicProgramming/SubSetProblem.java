package dynamicProgramming;

public class SubSetProblem {
    public static boolean subsetSum(int[]arr, int sum) {
        boolean[][] boolArr = new boolean[arr.length+1][sum+1];
        for (int i=0; i< arr.length+1; i++) {
            for (int j=0; j< sum+1; j++) {
                if(i==0 && j==0) {
                    boolArr[i][j] = true;
                }else if(i==0) {
                    boolArr[i][j] = false;
                } else if (j==0) {
                    boolArr[i][j] = true;
                } else if (arr[i-1] <= j) {
                    boolArr[i][j] = boolArr[i-1][j-arr[i-1]] || boolArr[i-1][j];
                } else {
                    boolArr[i][j] = boolArr[i-1][j];
                }
            }
        }
        return boolArr[arr.length][sum];
    }
    public static void main(String[] args) {
        int[] subset = new int[]{4,1,5,8,10};
        int sum = 11;
        boolean isPresent = subsetSum(subset, sum);
        System.out.println(isPresent);
    }
}
