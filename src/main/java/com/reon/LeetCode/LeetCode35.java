package com.reon.LeetCode;
// search insert position
public class LeetCode35 {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        // There will come a point when the start, end and mid is on same element,
        // and a condition come like the target is greater than the mid that's when the while loop condition is
        // violated, now the start > end, meaning the value is to be inserted where the start is pointing towards.
        return start;
    }
}
