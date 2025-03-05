package AI_Generated_Questions.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    /*
    Remove Duplicates from Sorted Array**
    Description:* Remove duplicates in-place and return the new length.
     */
    public static int removeDuplicatesInPlace(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int count = 1;  // 1st element of an array nums[0] is always unique

        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i - 1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
