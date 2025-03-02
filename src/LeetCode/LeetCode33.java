package LeetCode;

public class LeetCode33 {
    public static void main(String[] args) {
        LeetCode33 code33 = new LeetCode33();
        int[] nums = {1};
        int target = 0;
        int result = code33.search(nums, target);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {
        // initialize start and end pointers
        int start = 0, end = nums.length - 1;
        // while with a condition to check for all element in array
        while (start <= end){
            // get the middle value
            int mid = start + (end - start) / 2;

            // return the middle value if the condition is true
            if (target == nums[mid]){
                return mid;
            }

            /*
            eg: [4, 5, 6, 7, 0, 1, 2]
            So if the mid is 7, check whether the start (4) <= mid (7)
            if so then search in the left sorted part
             */
            if (nums[start] <= nums[mid]){
                /* while checking in left part, check if the target is >= start (say target is 6 and start is 4)
                and also check if target < the mid (say target is 6 and mid is 7)
                */
                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                /*
                In right side check if the target is <= end and target > mid
                 */
                if (target <= nums[end] && target > nums[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
