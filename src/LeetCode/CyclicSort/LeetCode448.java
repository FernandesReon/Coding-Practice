package LeetCode.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        LeetCode448 code448 = new LeetCode448();
        List<Integer> result = code448.findDisappearedNumbers(nums);
        System.out.println(result);
    }

    /*
    In this question we have to implement the classic cyclic sort algorithm,
        - only additional is the for loop to find the missing numbers,
        - We loop through entire array and check if the current index + 1 == the current element value
            - (because the numbers begin from 1 to n)
     */

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
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
            if (index + 1 != nums[index]){
                result.add(index + 1);
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
