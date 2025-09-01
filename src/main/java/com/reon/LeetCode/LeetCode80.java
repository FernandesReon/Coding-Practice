package com.reon.LeetCode;

public class LeetCode80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
    }

    public int removeDuplicates(int[] nums) {
        // there will always be a number with count of 2
        int index = 2;

        // we traverse from second index
        for (int i = 2; i < nums.length; i++) {
            // check if the current element is not equal to 2nd previous value
            if (nums[i] != nums[i - 2]){
                // if true that place that number on current index and increment the index
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
