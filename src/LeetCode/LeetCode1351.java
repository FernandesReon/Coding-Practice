package LeetCode;

public class LeetCode1351 {
    public static void main(String[] args) {
        LeetCode1351 code1351 = new LeetCode1351();
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int result = code1351.countNegatives2(grid);
        System.out.println(result);
    }
    public int countNegatives(int[][] grid) {
        // Brute force solution
        // time complexity --> O(m * n)
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public int countNegatives2(int[][] grid){
        /*
        Optimized solution --> time complexity: O(m + n)
        variables --> count (count the no of negatives)
                  --> m (total rows in matrix)
                  --> n (total columns in matrix)
                  --> row (1st row)
                  --> col (last col of matrix)
         */
        int count = 0, m = grid.length, n = grid[0].length, row = 0, col = n - 1;
        while (row < m && col >= 0){
            if (grid[row][col] < 0){
                count += (m - row);
                col--;
            }
            else {
                row++;
            }
        }
        return count;
    }
}

