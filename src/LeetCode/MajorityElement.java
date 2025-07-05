package LeetCode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int result = majorityElement2(nums);
        System.out.println(result);
    }

    // Brute force solution O(n2)
    public static int majorityElement(int[] nums) {
        int arrLen = nums.length;

        // For every element in the array
        for (int value : nums){
            // We will count, no of time it shows up in array
            int count = 0;
            for (int element : nums){
                // if current element appears again at different position, increment by 1
                if (value == element){
                    count++;
                }
            }

            // check the count of a number is greater than half the size of array, if so return that value.
            if (count > arrLen / 2){
                return value;
            }
        }
        // if no max value found return -1.
        return -1;
    }

    // Better solution
    public static int majorityElement2(int[] nums){
        Arrays.sort(nums);
        int majority = nums.length / 2;
        return nums[majority];
    }

    // Optimal Solution (Moore's Voting Algorithm)
    public static int majorityElement3(int[] nums){
        int count = 0, ans = 0;

        for (int num : nums) {
            if (count == 0) {
                ans = num;
            }

            if (ans == num) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}
