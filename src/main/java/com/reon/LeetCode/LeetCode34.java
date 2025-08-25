package com.reon.LeetCode;
// Find First and Last Position of Element in Sorted Array
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        // when searching for leftmost value
        result[0] = findValues(nums, target, true);
        // when searching for rightmost value
        result[1] = findValues(nums, target, false);
        return result;
    }

    private static int findValues(int[] nums, int target, boolean searchingLeft){
        int start = 0, end = nums.length - 1;
        int possibleAns = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // this lines of will help shrink the search space, until we find the target
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                // Once we find the target, what it means is we have found a possible answer
                // there are high chance that same value might be on either side
                possibleAns = mid;

                // to check if value exist on left and right side this code will help us
                if (searchingLeft) {
                    // searching on left side
                    end = mid - 1;
                }
                else {
                    // searching on right side.
                    start = mid + 1;
                }
            }
        }
        return possibleAns;
    }
}
