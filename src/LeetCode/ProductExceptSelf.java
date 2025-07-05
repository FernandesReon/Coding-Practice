package LeetCode;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf2(nums);
        System.out.println(Arrays.toString(result));
    }

    // Brute Force
    public static int[] productExceptSelf(int[] nums) {
        int arrLen = nums.length;
        int[] answer = new int[nums.length];

        for (int i = 0; i < arrLen; i++){
            int leftProduct = productRange(nums, 0, i);
            int rightProduct = productRange(nums, i + 1, arrLen);

            int product = leftProduct * rightProduct;
            answer[i] = product;
        }
        return answer;
    }

    public static int productRange(int[] nums, int start, int end){
        int product = 1;

        for (int i = start; i < end; i++){
            product *= nums[i];
        }
        return product;
    }

    // Optimal Solution
    public static int[] productExceptSelf2(int[] nums){
        int arrLen = nums.length;
        int[] ans = new int[arrLen];

        // leftmost element
        ans[0] = 1;
        for (int i = 1; i < arrLen; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // rightmost element
        int rightProduct = 1;
        for (int i = arrLen - 1; i >= 0; i--){
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
