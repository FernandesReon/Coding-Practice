package com.reon.LeetCode;

public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};     // output: 49
//        int[] height = {1,8,6,2,5,4,8,3,7};   output: 1

        LeetCode11 code11 = new LeetCode11();
        int result = code11.maxArea(height);
        System.out.println(result);
    }

    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, maxArea = 0;
        while (start < end) {
            /*
            area = width * height
            width = (end - start) -- (indices)
            height = Math.min(height[start, height[end]) -- actual values
             */
            int area = (end - start) * Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, area);

            if (height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxArea;
    }
}
