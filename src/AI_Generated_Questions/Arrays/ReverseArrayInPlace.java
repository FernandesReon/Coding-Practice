package AI_Generated_Questions.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {

    }

    /*
    Reverse an Array
    Description: Reverse the elements of an array in-place.
     */
    public static int[] reverseArrayInPlace(int[] nums){
        if (nums.length == 0) return new int[0];
        if (nums.length == 1) return nums;

        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        return nums;
    }
}
