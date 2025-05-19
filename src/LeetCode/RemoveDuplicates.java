package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates.removeDuplicates(nums);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        // edge cases
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        /*
        In Set duplicates value are not allowed.
        Traversed over the array,
        added those values in Set -- automatically the duplicates will not be counted.
        returned the size of the Set
         */
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        return uniqueElements.size();
    }
}
