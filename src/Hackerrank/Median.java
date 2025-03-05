package Hackerrank;

import java.util.Collections;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5,6);
        int result = findMedian(arr);
        System.out.println(result);
    }
    /*
    In this question we have to find the median of a List
    First we will sort the arr and take the length (size) of List
    If the size is odd we will just divide by 2
    If even formula for odd size + size divided by 2 -1 / 2
    finally return the median.
     */

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int arrLen = arr.size();
        int median;

        if (arrLen % 2 != 0){
            median = arr.get(arrLen / 2);
        }
        else {
            median = arr.get(arrLen / 2) + arr.get(arrLen / 2 - 1) / 2;
        }
        return median;
    }
}
