package LeetCode.CyclicSort;

public class LeetCode287 {
    public static void main(String[] args) {
        LeetCode287 code287 = new LeetCode287();
        int[] nums = {3,3,3,3,3};
        int result = code287.findDuplicate(nums);
        System.out.println(result);
    }
    public int findDuplicate(int[] nums) {
        int i = 0, result = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index ){
                result = nums[index];
            }
        }

        return result;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
