package LeetCode.CyclicSort;

import java.util.Arrays;

public class LeetCode645 {
    public static void main(String[] args) {
        LeetCode645 code645 = new LeetCode645();
        int[] nums = {2, 2};
        int[] result = code645.findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }

    /*
    In this question we have to find the duplicate element and the missing number,
    1. Classic cyclic sort
    2. Once the array is sorted we traverse the array to get the duplicate number and missing number:
     */

    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                ans[0] = nums[index];   // duplicate number
                ans[1] = index + 1;     // missing number
                break;
            }
        }
        return ans;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
