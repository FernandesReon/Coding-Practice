package Hackerrank.OneWeekPrepNWarmUp;

import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = List.of(4,4,1,3);
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        if (candles.isEmpty()) return 0;
        int max = candles.get(0), count = 0;

        for (Integer integer : candles) {
            if (integer > max) {
                max = integer;
            }
        }

        for (int candle : candles){
            if (candle == max){
                count++;
            }
        }
        return count;
    }
}
