package blind75;

import java.util.Arrays;

public class SetMatrixZero {
    private static void fillZero(int[][] mat, boolean[][] tempMatrix, int i, int j) {
        int x=0, y=0;
        while(x<mat.length ) {
            if(tempMatrix[x][j] == true ) {
                x++;
            } else if (mat[x][j] == 0) {
                x++;
            } else {
                tempMatrix[x][j]= true;
                x++;
            }
        }
        while(y < mat[i].length ) {
            if(tempMatrix[i][y] == true) {
                y++;
            } else if (mat[i][y] == 0) {
                y++;
            } else {
                tempMatrix[i][y]= true;
                y++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix= new int[][]{{0,1,1},{1,0,1},{1,1,1}};
//        int[][] matrix= new int[][]{{-2147483648},{2},{3}};
        if(matrix.length==0) return ;
        boolean[][] tempMatrix = new boolean[matrix.length][matrix[0].length];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    fillZero(matrix, tempMatrix, i, j);
                }
            }
        }

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++) {
                if(tempMatrix[i][j] == true) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

//        for (int i=0; i< matrix.length; i++) {
//            for (int j=0; j< matrix[i].length; j++) {
//                System.out.println(matrix[i][j] == Integer.MAX_VALUE+1);
//                System.out.println(matrix[i][j]);
//                System.out.println(Integer.MAX_VALUE+1);
//                System.out.println(Integer.MAX_VALUE);
//                if(matrix[i][j] == Integer.MAX_VALUE+1) {
//                    System.out.println("inside_2");
//                    matrix[i][j] = 0;
//                }
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
    }
}
