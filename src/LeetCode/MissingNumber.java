package LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3,0,1};

        int result = missingNumber.missingNumber(nums);
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        return nums.length;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
