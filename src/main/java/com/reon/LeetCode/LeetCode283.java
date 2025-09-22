package com.reon.LeetCode;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        LeetCode283 code283 = new LeetCode283();
        code283.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, start, i);
                start++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int start, int i) {
        int temp = nums[start];
        nums[start] = nums[i];
        nums[i] = temp;
    }
}
