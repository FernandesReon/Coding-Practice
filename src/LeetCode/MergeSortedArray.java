package LeetCode;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        mergeArray.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        /*
        Solution 1: (Not Recommended)
        Use a List to combine and sort both arrays, then copy back.
        Time: O((m+n)log(m+n)) | Space: O(m+n)

        Solution 2: (Recommended - In-place, efficient)
        Start filling nums1 from the end:
        - i = m - 1: last initialized element of nums1
        - j = n - 1: last element of nums2
        - k = m + n - 1: end of nums1 array

        While there are elements left in nums2 (j >= 0):
            If there are elements left in nums1 (i >= 0) and nums1[i] > nums2[j]:
                Place nums1[i] at position k, then move i and k left
            Else:
                Place nums2[j] at position k, then move j and k left
         */

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
                /*
                nums1[k--] = nums1[i--];
                */
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
                /*
                nums1[k--] = nums2[j--];
                 */
            }
        }
    }
}
