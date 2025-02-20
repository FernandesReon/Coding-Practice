package LeetCode;

public class LeetCode35 {
    public static void main(String[] args) {
        LeetCode35 code35 = new LeetCode35();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(code35.searchInsert(nums, target));
    }

    /*
    1. Take two variables and assign values (start = first element of array, end = last element of array),
    2. Run a while loop until the start is less than or equal to end value,
    3. Get the middle value,
    4. Now check whether the target == mid (if so then return the mid),
        else if target < (less than mid) then end = mid - 1,
        else if target > (greater than mid) then start = mid + 1
        if target not found the return the start value
    5. Reason: When there is only one element left, `start` will eventually become greater than `end`, ensuring `start`
                is the correct position to insert the target.
     */

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == nums[mid]){
                return mid;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
