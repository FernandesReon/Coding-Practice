package com.reon.LeetCode;
// remove duplicates for sorted array
public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        // Edge cases
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        // Position where unique values will be placed.
        int uniques = 1;

        // Iterate from 1st index to array length
        for (int i = 1; i < nums.length; i++) {

            // If the current element is not equal to previous one
            if (nums[i] != nums[i - 1]) {
                // add that value to the position
                nums[uniques] = nums[i];
                // move the pointer ahead
                uniques++;
            }
        }
        // Returns the size of the array after removing duplicates.
        return uniques;
    }
}
