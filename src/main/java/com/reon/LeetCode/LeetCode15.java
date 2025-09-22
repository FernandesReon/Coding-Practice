package com.reon.LeetCode;

import java.util.*;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0){
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                }
                else if (sum > 0){
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
