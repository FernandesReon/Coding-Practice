package LeetCode;

public class LeetCode27 {
    public static void main(String[] args) {
        LeetCode27 code27 = new LeetCode27();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(code27.removeElement(nums, val));
    }

    /*
    (We have to remove all the specific element from array without using a new array)
    1. initialize a variable to count element in array after specific elements are removed.
    2. Run a for loop then check the current element is equal to the specific element told to remove, if then continue
    3. If not then save the current element value in array and increment the count variable
     */

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                continue;
            }
            else {
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
