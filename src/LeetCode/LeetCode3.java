package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public static void main(String[] args) {
        LeetCode3 code3 = new LeetCode3();
        String s = "abcabcbb";
        int result = code3.lengthOfLongestSubstring2(s);
        System.out.println(result);

    }
    /*
    Brute force solution
    1. Create a helper method that will return a boolean
        1.1 --> Use Set or Hashmap to store the unique characters of string,
    2. Run a for-loop and check whether the set contains the current characters or not, if so then return false else
        add the characters to the set.
    3. Return true.
    4. In lengthOfLongestSubstring method take two variables, one for length of the string, another for counting max length of unique characters.
    5. Run nested for-loops and if the characters are uniques, update the maxCount and return it.Brute force solution
    1. Create a helper method that will return a boolean
        1.1 --> Use Set or Hashmap to store the unique characters of string,
    2. Run a for-loop and check whether the set contains the current characters or not, if so then return false else
        add the characters to the set.
    3. Return true.
    4. In lengthOfLongestSubstring method take two variables, one for length of the string, another for counting max length of unique characters.
    5. Run nested for-loops and if the characters are uniques, update the maxCount and return it.
     */
    public int lengthOfLongestSubstring(String s) {
        int strLen = s.length();
        int maxCount = 0;

        for (int i = 0; i < strLen; i++){
            for (int j = i; j < strLen; j++){
                if (isUniqueChar(s, i, j)){
                    maxCount = Math.max(maxCount, j - i + 1);
                }
            }
        }
        return maxCount;
    }

    private boolean isUniqueChar(String string, int start, int end){
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = start; i <= end; i++){
            if (uniqueChars.contains(string.charAt(i))){
                return false;
            }
            uniqueChars.add(string.charAt(i));
        }
        return true;
    }

    public int lengthOfLongestSubstring2(String s){
        // Using Sliding window.
        int strLen = s.length();
        int start = 0, maxCount = 0;
        Set<Character> uniqueChars = new HashSet<>();

        for (int end = 0; end < strLen; end++){
            while (uniqueChars.contains(s.charAt(end))){
                uniqueChars.remove(s.charAt(start));
                start++;
            }
            uniqueChars.add(s.charAt(end));
            maxCount = Math.max(maxCount, end - start + 1);
        }
        return maxCount;
    }
}
