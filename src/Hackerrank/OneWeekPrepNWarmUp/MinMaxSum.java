package Hackerrank.OneWeekPrepNWarmUp;

import java.util.List;
public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 3, 5, 7);
        miniMaxSum(arr);
    }

    /*
    In this question first find the minimum and maximum value in the List, also calculate the sum of all elements
    Then to get minimum sum subtract max value and vice versa.
     */
    public static void miniMaxSum(List<Integer> arr) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        long totalValue = 0;

        for (int num : arr){
            totalValue += num;

            if (num > min){
                min = num;
            }
            if (num < max){
                max = num;
            }
        }

        long minSum = totalValue - max;
        long maxSum = totalValue - min;

        System.out.println(maxSum + " " + minSum);
    }
}
