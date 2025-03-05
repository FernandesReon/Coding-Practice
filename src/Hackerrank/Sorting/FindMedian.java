package Hackerrank.Sorting;

import java.util.Collections;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {
        List<Integer> nums = List.of(0, 1, 2, 4, 6, 5, 3);
        int result = findMedian(nums);
        System.out.println(result);
    }

    public static int findMedian(List<Integer> arr){
        int median = 0, arrSize = arr.size();
        Collections.sort(arr);
        for (int i = 0; i < arrSize; i++){
            if (arrSize % 2 != 0){
                median = arr.get(arrSize / 2);
            }
            else {
                median = arr.get(arrSize / 2) + arr.get((arrSize - 1) / 2) / 2;
            }
        }
        return median;
    }
}
