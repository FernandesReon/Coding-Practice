package AI_Generated_Questions.Arrays;

public class RotateArray {
    /*
    Rotate Array by K Positions**
    Description:* Rotate elements to the right by `k` (e.g., `[1,2,3]` → `[3,1,2]` for `k=1`).
     */
    public static int[] rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length -1); // rotate the full array
        reverse(nums, nums[0], k);      // rotate the array from 1st element till k
        reverse(nums, k, nums.length - 1);
        return nums;
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
