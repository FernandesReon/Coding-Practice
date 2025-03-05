package Hackerrank.OneWeekPrepNWarmUp;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0, rightDiagonal = 0, arrLen = arr.size();
        for (int i = 0; i < arr.size(); i++){
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(arrLen - 1 - i);
        }
        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
