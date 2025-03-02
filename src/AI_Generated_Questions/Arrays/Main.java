package AI_Generated_Questions.Arrays;


public class Main {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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

    /*
    Rotate Array by K Positions**
    Description:* Rotate elements to the right by `k` (e.g., `[1,2,3]` → `[3,1,2]` for `k=1`).
     */
    public static int[] rotate(int[] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length -1); // rotate the full array
        reverse(nums, nums[0], k);      // rotate the array from 1st element till k
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
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
