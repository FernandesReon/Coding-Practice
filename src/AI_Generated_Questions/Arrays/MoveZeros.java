package AI_Generated_Questions.Arrays;

import LeetCode.LeetCode283;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println("Before: " + Arrays.toString(nums));
        LeetCode283 code283 = new LeetCode283();
        code283.moveZeroes(nums);
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
}
