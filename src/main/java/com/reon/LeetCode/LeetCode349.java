package com.reon.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> uniques = new HashSet<>();
       Set<Integer> result = new HashSet<>();

       for (int num : nums1) {
           uniques.add(num);
       }

       for (int num : nums2) {
           if (uniques.contains(num)) {
               result.add(num);
           }
       }

       int[] ans = new int[result.size()];
       int i = 0;
       for (int val : result) {
           ans[i++] = val;
       }
       return ans;
    }
}
