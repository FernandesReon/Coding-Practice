package com.reon.LeetCode;

public class LeetCode1351 {

    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };

        System.out.println(countNegatives(grid));
    }

    // optimal solution
    private static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int row = 0;
        int col = grid.length - 1;
        int count = 0;

        while (row < rows && col >= 0) {
            if (grid[row][col] < 0){
                count += rows - row;
                col--;
            }
            else {
                row++;
            }
        }
        return count;
    }

    // Brute force solution
    public static int countNegatives2(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j =0; j < grid[i].length; j++) {
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
