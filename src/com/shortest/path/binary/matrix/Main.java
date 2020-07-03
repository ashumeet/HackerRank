package com.shortest.path.binary.matrix;

/*
Given a 2d grid map of 1s (land) and 0s (water), what is the minimum number of steps
taken to reach the last column (grid.length, grid[0].length) from 0, 0.


Example 1:
Input:
1111
0001
1111
1000
1111
Output: 14

Return 0 if there is no straight path.

Example 1:
Input:
1111
0001
1011
1000
1111
Output: 0

 */

public class Main {
    public static void main(String[] args){
        System.out.println(Solution.shortestPath(new int[][]
                {
                        {1,1,1,1},
                        {0,0,0,1},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,1,1,1}
                }));
        System.out.println(Solution.shortestPath(new int[][]
                {
                        {1,1,1,1},
                        {0,0,0,1},
                        {1,0,1,1},
                        {1,0,0,0},
                        {1,1,1,1}
                }));
    }
}

class Solution {
    public static int shortestPath(int[][] grid){
        int path = dfs(grid, 0 , 0, -1, -1, 1);
        return path == Integer.MAX_VALUE ? 0 : path;
    }

    private static int dfs(int[][] grid, int i, int j, int xPar, int yPar, int depth) {
        if(i >= grid.length || j < 0 || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if(grid[i][j] == 0) {
            return Integer.MAX_VALUE;
        }

        if(i == grid.length - 1 && j == grid[0].length - 1 && grid[i][j] == 1) {
            return depth;
        }

        int xP = xPar == i + 1 && yPar == j ? Integer.MAX_VALUE : dfs(grid, i + 1, j, i, j, depth++);
        int yP = xPar == i && yPar == j + 1 ? Integer.MAX_VALUE : dfs(grid, i, j + 1, i, j, depth++);
        int yM = xPar == i && yPar == j - 1 ? Integer.MAX_VALUE : dfs(grid, i, j - 1, i, j, depth++);

        return Math.min(xP, Math.min(yP, yM));
    }
}