package LeetCode;

public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1,3,5,6};
        int target = 5;

        int result = searchInsert.searchInsert(nums, target);
        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        /*
        Use Binary Search -- Time complexity O(log n)
         */
        int start = 0, end = nums.length - 1;

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
        /*
        There will come a point when there will be only element in array
        Start and End will be pointing at the same element and the target value will be on right side (greater than mid)
        That means start = middle + 1 -- now start goes out of bound
        while loop condition violated - now(start > end), Hence the ans is start.
         */
        return start;
    }
}
