package LeetCode.CyclicSort;

public class LeetCode268 {
    public static void main(String[] args) {
        LeetCode268 code268 = new LeetCode268();
        int[] nums = {0};
        int result = code268.missingNumber(nums);
        System.out.println(result);
    }

    /*
    In this question, we have to find the missing number from a given array containing numbers from 0 to n.
    The array has a length of n, which means one number is missing.

    - We use the Cyclic Sort algorithm, which is useful when numbers are in a range from 0 to n.
    - The idea is to place each number at its correct index (i.e., number `x` should be at index `x`).
    - If a number is not at its correct index, we swap it with the correct position.
    - After sorting, the missing number will be the index where the value doesn't match.
*/
    public int missingNumber(int[] nums) {
       int i = 0;
       while (i < nums.length){
           int correctIndex = nums[i];
           if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
               swap(nums, i, correctIndex);
           }else {
               i++;
           }
       }

       for (int index = 0; index < nums.length; index++){
           if (nums[index] != index){
               return index;
           }
       }
       return nums.length;
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
