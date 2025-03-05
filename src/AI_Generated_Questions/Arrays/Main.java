package AI_Generated_Questions.Arrays;


public class Main {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    /*
    Sum of Array Elements**
    Description:* Calculate the sum of all elements.
     */
    public static int sumOfArrayElements(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int sum = 0;
        for (int i = 0; i <= nums.length; i++){
            sum += i;
        }
        return sum;
    }

    /*
    Average of Array Elements**
    Description:* Compute the average of elements.
     */
    public static int averageOfArrayElements(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int sum = 0;
        int average = 0;

        for (int i = 0; i <= nums.length; i++){
            sum += i;
        }

        average = sum / nums.length;
        return average;
    }

    /*
    Linear Search**
    Description:* Find the index of a target value using linear search.
     */
    public static int linearSearch(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
