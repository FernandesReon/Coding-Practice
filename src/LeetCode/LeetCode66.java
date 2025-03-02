package LeetCode;

import java.util.Arrays;

public class LeetCode66 {
    public static void main(String[] args) {
        LeetCode66 code66 = new LeetCode66();
        int[] digits = {9};
        System.out.println(Arrays.toString(code66.plusOne(digits)));
    }
    /*
    1. Run a reverse for loop,
    2. check if the last element in array is less than 9 (if so then increment by 1) and return the current array.
    3. If last element is 9 then set it to 0,
    4. Create a new array of length of current one + 1
    5. set the 0th index to 1 and return the new array.
     */

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
