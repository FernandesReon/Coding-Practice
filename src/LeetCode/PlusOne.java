package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();

        int[] digits = {9,9,9};
        int[] result = plusOne.plusOne(digits);

        System.out.println(Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {

        // Traverse in reverse order
        for (int i = digits.length - 1; i >= 0; i--){
            // if last element is less than 9
            if (digits[i] < 9){
                // increment it
                digits[i]++;
                // return
                return digits;
            }
            // if current digit is 9, set to 0 and continue carry to next digit
            digits[i] = 0;
        }
        // Create new array with size + 1
        int[] newDigits = new int[digits.length + 1];
        // Set the 1st element to 1
        newDigits[0] = 1;
        return newDigits;
    }
}
