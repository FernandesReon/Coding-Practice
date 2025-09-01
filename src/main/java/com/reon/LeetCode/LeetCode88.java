package com.reon.LeetCode;

import java.util.Arrays;

// merge sorted array
public class LeetCode88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        We have to add the elements of num2 array in num1,
        take 3 variables - one at the last value of num1, second at the last value of num2 and third at last index of num1
        As long as j >= 0, we will check if the ith value is greater than jth value also ith value is >= 0 if true
            then place the ith value at kth position, decrement the i and k
        else if decrement j.
         */
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
