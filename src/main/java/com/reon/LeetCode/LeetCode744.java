package com.reon.LeetCode;

public class LeetCode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        // when start == to length of the array, meaning we haven't found the answer (target)
        // We have to return the 1st element
        return letters[start % letters.length];
    }
}
