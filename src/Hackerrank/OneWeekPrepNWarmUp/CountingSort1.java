package Hackerrank.OneWeekPrepNWarmUp;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] frequency = new int[100];

        for (int num : arr){
            frequency[num]++;
            // frequency[num] += 1  (another way of writing)
        }

        List<Integer> result = new ArrayList<>();
        for (int count : frequency){
            result.add(count);
        }
        return result;
    }
}
