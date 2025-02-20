package LeetCode;

public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        LeetCode744 code744 = new LeetCode744();
        char result = code744.nextGreatestLetter(letters, target);
        System.out.println(result);
    }
    /*
    Approach: Use Binary Search to find the smallest character greater than the target.

    1. If `letters[mid]` is greater than `target`, move `end` to `mid - 1` (search in the left half).
    2. Otherwise, move `start` to `mid + 1` (search in the right half).
    3. If no greater character is found, `start` will become equal to `letters.length`, and
       `letters[start % letters.length]` ensures we wrap around to return the first element.

    Example:
    letters[] = {'x', 'x', 'y', 'y'}, target = 'z'
    - Since all elements are smaller than 'z', `start` becomes 4.
    - `letters[4 % 4]` gives `letters[0]`, returning 'x'.
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
