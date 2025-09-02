package com.reon.LeetCode;
// Majority element
public class LeetCode169 {
    public static void main(String[] args) {
        int[] nums = {3,3,4,3,4,5,5,3,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        /*
        think of it like a game.
        We have multiple candidates and have to get the one with majority count.
        when a candidate appears multiple time we increment the points, but as soon as the new candidate appears we
        decrement the point, if one of the candidate points become 0, we take the current candidate as new one and start
        the count again.
         */
        int count = 0, ans = 0;

        for (int num : nums) {
            if (count == 0) {
                ans = num;
            }

            if (ans == num) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}
