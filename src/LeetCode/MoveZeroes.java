package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length < 1){
            System.out.println("Array cannot be empty.");
        }

        if (nums.length == 1){
            System.out.println(nums[0]);
        }

        int start = 0;
        for (int end = 0; end < nums.length; end++){
            if (nums[end] != 0){
                swap(nums, start, end);
                start++;
            }
        }
        System.out.println("Zeroes moved to end: "+ Arrays.toString(nums));
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
