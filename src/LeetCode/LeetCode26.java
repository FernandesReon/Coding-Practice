package LeetCode;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3, 4, 6, 6, 7};
        LeetCode26 code26 = new LeetCode26();
        int result = code26.removeDuplicates(nums);
        System.out.println(result);

    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
