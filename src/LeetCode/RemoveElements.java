package LeetCode;

public class RemoveElements {
    public static void main(String[] args) {
        RemoveElements removeElements = new RemoveElements();
        int[] nums = {3,2,2,3};
        int value = 3;

        int result = removeElements.removeElement(nums, value);
        System.out.println(result);
    }
    public int removeElement(int[] nums, int val) {
        /*
        Take a variable to count the elements after removing the desired value
        Traverse over the array
        Check for a condition whether the current value is not equal to desired value
        Copy the current element to front of the array
         */
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[count++] = nums[i];
                /*
                nums[count] = nums[i];
                count++;
                 */
            }
        }
        return count;
    }
}
