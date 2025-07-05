package LeetCode;

public class MaximumSumCircularSubarray {
    public static void main(String[] main){
        int[] nums = {5, -3, 5};
        int result = maxSubarraySumCircular(nums);
        System.out.println(result);
    }

    public static int maxSubarraySumCircular(int[] nums){
        int currentMax = nums[0], currentMin = nums[0];
        int globalMax = nums[0], globalMin = nums[0];
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentMax = Math.max(currentMax + num, num);
            globalMax = Math.max(globalMax, currentMax);

            currentMin = Math.min(currentMin + num, num);
            globalMin = Math.min(globalMin, currentMin);

            total += num;
        }

        if (total == globalMin) {
            return globalMax;
        }

        return Math.max(globalMax, total - globalMin);
    }

}
