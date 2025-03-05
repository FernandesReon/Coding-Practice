package AI_Generated_Questions.Arrays;

public class SortArray {
    public static void main(String[] args) {

    }
    /*
    Check Sorted Array
   Description:* Determine if an array is sorted in ascending or descending order.
     */
    public static boolean checkOrder(int[] nums){
        for (int i = 0; i < nums.length -1; i++){
            if (nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
}
