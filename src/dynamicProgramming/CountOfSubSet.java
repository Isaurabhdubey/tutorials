package dynamicProgramming;

public class CountOfSubSet {
    public static int subsetSum(int[] arr, int size) {
        int[][] tempArr = new int[arr.length+1][size+1];
        for (int i=0; i< arr.length+1; i++) {
            for (int j = 0; j < size+1; j++) {
                if(i==0 && j==0) {
                    tempArr[i][j] = 1;
                }else if(i==0) {
                    tempArr[i][j] = 0;
                } else if(j==0) {
                    tempArr[i][j] = 1;
                } else if(arr[i-1] <= j) {
                    tempArr[i][j] = tempArr[i-1][j] + tempArr[i-1][j - arr[i-1]];
                } else {
                    tempArr[i][j] = tempArr[i-1][j];
                }
            }
        }
        return tempArr[arr.length][size];
    }
    public static void main(String[] args) {
        int[] subset = new int[]{2,3,5,6,8,10};
        int result = subsetSum(subset, 10);
        System.out.println(result);
    }
}
