package LeetCode;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    // Brute force O(n2)
    public static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < nums.length; start++){
            int currentSum = 0;
            for (int end = start; end < nums.length; end++){
                currentSum += nums[end];
                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSubArray2(int[] nums){
        // Kadane's Algorithm
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
