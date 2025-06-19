package Problem_Solving.simple_questions;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.next();

        System.out.print(isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        char[] characters = word.toCharArray();

        int start = 0, end = characters.length - 1;

        while (start < end){
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }
        String reversed = String.valueOf(characters);
        return reversed.equals(word);
    }
}
