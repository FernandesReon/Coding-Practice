package Hackerrank.Sorting;

import java.util.List;
public class IntroChallenge {
    public static void main(String[] args) {

    }

    public static int introTutorial(int V, List<Integer> arr) {
        int ans = 0, start = 0, end = arr.size() - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == V){
                ans = mid;
                break;
            }
            else if (arr.get(mid) > V){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
