package com.reon.LeetCode;
// Sqrt(x)
public class LeetCode69 {
    public static void main(String[] args) {
        int x = 2147395599;     // Output: 46339
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;     // base cases
        int start = 0, end = x;     // two pointers to keep track for search space

        while (start <= end) {      // search for every element in range
            int mid = start + (end - start) / 2;

            long square = ((long) mid * mid);       // to avoid integer overflow eg: int x = 2147395599;
            if (square > x) {   // if square is greater than x, that means the sqrt lies on left side of number range
                end = mid - 1;
            } else if (square == x) {     // if square is equal to x, meaning we found the answer.
                return mid;
            } else {          // if square is less than x, meaning sqrt lies on right side of number range
                start = mid + 1;
            }
        }
        // there will come step when all three variables will point at one value, that time start > end.
        return end;
    }
}
