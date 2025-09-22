package com.reon.LeetCode;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target){
                break;
            }
            else if (sum > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[]{start + 1, end + 1};
    }
}
