package graph;
class Solution {
    public static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int column = grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=column || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        int rows = grid.length;
        int column = grid[0].length;
        for (int i =0; i< rows; i++) {
            for (int j=0; j<column; j++) {
                if(grid[i][j] == '1') {
                    count ++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println("Number of islands: " + numIslands(grid));
    }
}