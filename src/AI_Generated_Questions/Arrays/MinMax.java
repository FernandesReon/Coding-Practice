package AI_Generated_Questions.Arrays;

public class MinMax {
    public static void main(String[] args) {

    }

    /*
    Find Maximum Element
    Description: Write a method to return the largest element in an integer array.
     */
    public static int maxElement(int[] nums){
        if (nums.length == 1) return nums[0];

        int maxValue = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > maxValue){
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    /*
    Find Minimum Element
    Description: Return the smallest element in an integer array.
     */

    public static int minElement(int[] nums){
        if (nums.length == 1) return nums[0];

        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < minValue){
                minValue = nums[i];
            }
        }
        return minValue;
    }
}
