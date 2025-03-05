package Hackerrank.OneWeekPrepNWarmUp;

import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,1,2,3);
        int result = lonelyInteger(arr);
        System.out.println(result);
    }
    /*
    In this question we have to find the unique element in the array
    We have use Bit Manipulation (XOR)
    1. initialize a variable to store result
    2. Traverse the array, if both elements are same the value is zero
        else value is one which is unique
     */
    public static int lonelyInteger(List<Integer> a) {
        int result = 0;
        for (int num : a){
            result ^= num;
        }
        return result;
    }
}
