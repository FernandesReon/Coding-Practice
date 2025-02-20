package LeetCode;

import java.util.Arrays;

public class LeetCode88 {
    public static void main(String[] args) {
        LeetCode88 code88 = new LeetCode88();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        code88.merge(nums1, m, nums2, n);

    }

    /*
    (We have to merge the arrays without using an extra array.)
    1. We need three pointers: i, j, and k
        --> i = m - 1 (points to the last initialized element of nums1)
        --> j = n - 1 (points to the last element of nums2)
        --> k = m + n - 1 (points to the last index of nums1)
     2. Compare nums1[i] and nums2[j] to place the largest value at index k in nums1:
        --> If nums1[i] > nums2[j], place nums1[i] at nums1[k], then decrement both i and k.
        --> Otherwise, place nums2[j] at nums1[k], then decrement both j and k.
     3. Continue this process until all elements from nums2 are merged into nums1.
*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        System.out.print(Arrays.toString(nums1));
    }
}
