package com.reon.LeetCode;

import java.util.Arrays;

// Rotate Array
public class LeetCode189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        // if k greater than length of array
        int arr_len = nums.length;
        if (k > arr_len) {
            k = k % arr_len;
        }
        // rotate complete array
        reverse(nums, 0, nums.length - 1);
        // rotate from start till k
        reverse(nums, 0, k - 1);
        // rotate from k till end
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
