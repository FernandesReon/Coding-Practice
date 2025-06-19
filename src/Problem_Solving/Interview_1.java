package Problem_Solving;

import java.util.Arrays;

public class Interview_1 {
    /*
    Reverse the array, if the numbers are odd decrement it by 1 and then sum it.
     */
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        reverseSum(nums);
    }

    public static void reverseSum(int[] nums){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                nums[i]--;
            }
        }
        System.out.println("Decremented odd numbers: " + Arrays.toString(nums));

        int start = 0, end = nums.length - 1;
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        System.out.println("Array reversed: " + Arrays.toString(nums));

        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        System.out.println("Final Sum: " + sum);
    }
}
