package LeetCode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0,1,0,3,12};  // expected output: [1, 3, 12, 0, 0]
        moveZeroes.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums) {
        // Edge cases
        if (nums.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        if (nums.length == 1){
            System.out.println(nums[0]);
        }

        /*
        Use a variable 'start' to keep track of the position to place the next non-zero element.
         Traverse the array:
           - If the current element is not zero, swap it with the element at index 'start'.
           - Increment 'start' to move the pointer forward.
         This ensures all non-zero elements are moved to the front, and zeros are pushed to the end.
         */

        int start = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                swap(nums, start, i);
                start++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
