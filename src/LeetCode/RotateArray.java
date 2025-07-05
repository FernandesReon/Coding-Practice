package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        /*
        1. Check if k > than array length, if so then -> k = k % array len
        2. Rotate the complete array                -> [7,6,5,4,3,2,1]
        3. Rotate from 0 to k -1                    -> [5,6,7,4,3,2,1,]
        4. Rotate from k to nums.length - 1;        -> [5,6,7,1,2,3,4]
         */
        int arrLen = nums.length;

        if (k > arrLen){
            k %= arrLen;
        }

        reverse(nums, 0, arrLen - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, arrLen - 1);

        System.out.println("Array rotated " + k + " times: " + Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
