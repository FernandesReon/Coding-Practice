package AI_Generated_Questions.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

    }
    /*
   Binary Search**
   Description:* Implement binary search for a sorted array.
    */
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (target == mid){
                return mid;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
