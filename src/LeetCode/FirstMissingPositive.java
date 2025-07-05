package LeetCode;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int result = firstMissingPositiveNumber(nums);
        System.out.println(result);
    }

    // Brute force solution
    public static int firstMissingPositiveNumber(int[] nums){
        Arrays.sort(nums);
        // assuming our missing number is 1
        int missingValue = 1;

        // Checking if it exists in array
        for (int num : nums) {
            if (num > 0) {
                if (num == missingValue) {
                    missingValue++;
                } else if (num > missingValue) {
                    break;
                }
            }
        }
        return missingValue;
    }


    // Optimal Solution
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;

            // Sorting only +ve (positive) values
            if (nums[i] > 0 &&  nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }

        // Checking if values are on correct index
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return index + 1;
            }
        }

        // When missing number is not found.
        return nums.length + 1;
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
