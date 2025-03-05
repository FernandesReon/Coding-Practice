package LeetCode;

import java.util.Arrays;

public class LeetCode283 {
    /*
    In this question we have to move the -ve elements to right of the array
    1. We will check edge cases like if array is empty and only if one element in array
    2. Initialize a variable to keep track of where next non-zero element should be placed.
    3. Run a for loop and check if the element on current index is +ve, if not swap it and increment start by 1
     */
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println("Before: " + Arrays.toString(nums));
        LeetCode283 code283 = new LeetCode283();
        code283.moveZeros2(nums);
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 0){
            System.out.println("Array is empty.");
        }
        if (nums.length == 1){
            System.out.println(nums[0]);
        }

        int start = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums, start, i);
                start++;
            }
        }
        System.out.println("Array after moving zero: " + Arrays.toString(nums));
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    // another way to solve this question
    public void moveZeros2(int[] nums){
        int start = 0, end = 0;
        while (start < nums.length){
            if (nums[start] != 0){
                swap(nums, start, end);
                end++;
            }
            start++;
        }
        System.out.println("Array after moving zero: " + Arrays.toString(nums));
    }
}
