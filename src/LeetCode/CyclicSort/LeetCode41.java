package LeetCode.CyclicSort;

import java.util.Arrays;

public class LeetCode41 {
    public static void main(String[] args) {
        LeetCode41 code41 = new LeetCode41();
        int[] nums = {1};
        int result = code41.firstMissingPositiveNumber(nums);
        System.out.println(result);
    }

    /*
    In this question we will have to find the 1st +ve missing number,
    1. Sort the array
    2. Initialize a variable for checking the missing number, we assume 1 is the missing number,
    3. Run a for-each loop,
    4. Condition is to start checking for 1, -- if (number > 0)
    5. if current number is equal to missing number, increment it by 1
    6. else if the current number greater than missing number, break the loop.
    7. Return the missing number
     */

    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missingNumber = 1;
        for (int num : nums){
            if (num > 0){
                if (num == missingNumber){
                    missingNumber++;
                }
                else if (num > missingNumber){
                    break;
                }
            }
        }
        return missingNumber;
    }

    /*
    Using Cyclic sort
     */

    public int firstMissingPositiveNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
