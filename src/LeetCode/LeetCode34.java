package LeetCode;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        LeetCode34 code34 = new LeetCode34();
        int[] nums = {};
        int target = 0;

        int[] result = code34.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    /*
    In this problem, we need to find the first and last position of a given target element in a sorted array.
        1. A normal binary search algorithm is modified by using a variable to store a possible answer.
        2. Create a helper method `binarySearch` with a return type of `int`. It takes three parameters:
           - `int[] nums` (the sorted input array)
           - `int target` (the target element to search for)
           - `boolean isSearchingLeft` (a flag to determine whether to search for the leftmost or rightmost occurrence of the target)
        3. In `binarySearch`, perform a standard binary search:
           - If `target < nums[mid]`, search the left half (`end = mid - 1`).
           - If `target > nums[mid]`, search the right half (`start = mid + 1`).
           - If `target == nums[mid]`, store `mid` as a possible answer and continue searching:
             - If `isSearchingLeft` is `true`, move left (`end = mid - 1`) to find the first occurrence.
             - Otherwise, move right (`start = mid + 1`) to find the last occurrence.
        4. The `searchRange` method calls `binarySearch` twice:
           - Once with `isSearchingLeft = true` to find the first occurrence.
           - Once with `isSearchingLeft = false` to find the last occurrence.
        5. Return the result as an array `{firstOccurrence, lastOccurrence}`. If the target is not found, return `{-1, -1}`.
*/

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;
    }

    public int binarySearch(int[] nums, int target, boolean isSearchingLeft){
        int start = 0, end = nums.length - 1, possibleAns = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                possibleAns = mid;

                if (isSearchingLeft){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return possibleAns;
    }

}
