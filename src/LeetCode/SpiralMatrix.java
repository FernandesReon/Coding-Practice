package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, left = 0, right = cols - 1, bottom = rows - 1;

        while (left <= right && top <= bottom){
            // Traverse left to right
            for (int i = left; i <= right; i++){
                output.add(matrix[top][i]);
            }
            top++;

            // Traverse top to bottom
            for (int i = top; i <= bottom; i++){
                output.add(matrix[i][right]);
            }
            right--;

            // Traverse right to left
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Traverse bottom to top
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }

        return output;
    }
}
