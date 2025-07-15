package blind75;

public class IslandProblem {
    public static void lp(int[][] array, int i, int j) {
        if(i < 0 || j< 0 || i==array.length || j==array[i].length || array[i][j] == 0) {
            return;
        }
        if(array[i][j] == 1) {
            array[i][j] = 0;
        }
        lp(array, i, j+1);
        lp(array, i+1, j);
        lp(array, i, j-1);
        lp(array, i-1, j);
    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,1,1,0},{1,1,0,1}, {0,1,1,1}, {0,0,0,1}};
        int count = 0;
        for (int i=0; i< array.length; i++) {
            for (int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        for (int i=0; i< array.length; i++) {
            for (int j = 0; j< array[i].length; j++) {
                if(array[i][j]== 1) {
                    count++;
                    lp(array, i, j);
                }
            }
        }
        System.out.println("Count => "+ count);
    }
}
