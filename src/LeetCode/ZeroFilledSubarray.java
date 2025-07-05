package LeetCode;

public class ZeroFilledSubarray {
    public static void main(String[] args) {
        int[] nums = {1,3,0,0,2,0,0,4};
        long result = zeroFilledSubarray(nums);
        System.out.println(result);
    }

    public static long zeroFilledSubarray(int[] nums){
        // Count no of subarrays with zero
        long totalCount = 0;
        // current count of zeros
        int currentZeroCount = 0;

        // Iterator over the array
        for (int num : nums){
            // if current element is zero
            if (num == 0){
                // increment it
                currentZeroCount++;
                // add the count and total count
                totalCount += currentZeroCount;
            }
            else {
                // if not zero, reset the count
                currentZeroCount = 0;
            }
        }
        return totalCount;
    }
}
