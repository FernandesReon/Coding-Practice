package LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {3,0,1};

        int result = missingNumber.missingNumber(nums);
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        // we start from the 1st element in array
        int i = 0;
        // loop the entire array
        while (i < nums.length){
            // (get the correct index) the correct index of the element in array is the value itself.
            int correctIndex = nums[i];
            /*
            Check if:
                the current element is less than the length of array and whether the current element is at correct index
                if not then swap the current element with it position (index)
             */
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else {
                /*
                Move the pointer ahead,
                if the current element is on right position
                 */
                i++;
            }
        }
        /*
        Once the array is sorted, we will check whether all elements are on correct index
        if not then that index is our answer
         */
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index){
                return index;
            }
        }
        /*
         if all elements are on correct index but if we still don't get our answer, then the missing number is the
         actual length of the array.
         */
        return nums.length;
    }

    private void swap(int[] nums, int start, int end) {
        /*
        Take temporary variable -- keep the start value in it
        keep the end value in start
        now keep the temporary value in end.
         */
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
