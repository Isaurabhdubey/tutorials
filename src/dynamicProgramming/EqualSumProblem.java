package dynamicProgramming;

public class EqualSumProblem {
    public static boolean subSetSum(int[] arr, int sum) {
        boolean[][] tempArr = new boolean[arr.length+1][sum+1];
        for (int i=0; i < arr.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0 && j==0) {
                    tempArr[i][j] = true;
                }else if(i==0) {
                    tempArr[i][j] = false;
                } else if (j==0) {
                    tempArr[i][j] = true;
                } else if(arr[i-1]<= j) {
                    tempArr[i][j] = tempArr[i-1][j- arr[i-1]] || tempArr[i-1][j];
                } else {
                    tempArr[i][j] = tempArr[i-1][j];
                }
            }
        }
        return tempArr[arr.length][sum];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,2,6,11};
        int sum = 11;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        if(totalSum % 2 !=0) {
            System.out.println(false);
        } else if(subSetSum(arr, totalSum/2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
