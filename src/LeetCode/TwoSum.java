package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target){
        /*
        Use nested for-loop
        Check if the value at nums[i] + nums[j] == target
            if equal to target then return their indices, else return -1, -1
         */

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
