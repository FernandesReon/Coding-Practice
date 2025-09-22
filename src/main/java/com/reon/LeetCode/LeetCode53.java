package com.reon.LeetCode;

public class LeetCode53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        LeetCode53 max = new LeetCode53();
        System.out.println(max.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int arr_len = nums.length;
        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < arr_len; i++) {
            int num = nums[i];
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
