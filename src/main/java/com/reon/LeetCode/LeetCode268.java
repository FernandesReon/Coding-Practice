package com.reon.LeetCode;

public class LeetCode268 {
    /*
    Since the element in array are in range of 0 and n,
    We can use cyclic sort algorithm,
    1. Sort the array -- condition -- if the element is not on correctIndex swap it with correct one.
        arrays are 0-indexed -- our array start from 0 therefore the correctIndex = value itself
        if element is not correct index move the pointer to next element.
    2. Traverse over the sort array and check if element are on correct index position, any element not so return it.
    3. If missing value not found in previous step that means our missing number is the length of the array itself.
     */
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
