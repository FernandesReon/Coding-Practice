package Hackerrank.OneWeekPrepNWarmUp;

import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 0, -1, -1);
        plusMinus(arr);
    }

    /*
    In this question we have to first count the number of +ve, -ve and zero value,
    Then divide the no.of count of each category by the total length of the ArrayList.
     */

    public static void plusMinus(List<Integer> arr){
        int totalSize = arr.size(), positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (int num : arr){
            if (num < 0){
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
            else {
                zeroCount++;
            }
        }

        double positiveRatio = (double) positiveCount / totalSize;
        double negativeRatio = (double) negativeCount / totalSize;
        double zeroRation = (double) zeroCount / totalSize;

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRation);
    }
}
