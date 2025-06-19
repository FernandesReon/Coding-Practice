package Problem_Solving.simple_questions;

public class InrToUsd {
    public static void main(String[] args) {
        double result = convertToUSD(100);
        System.out.printf("Converted value: %.2f", result);
    }

    public static double convertToUSD(int value){
        double USD_rate = 86.33;
        return value / USD_rate;
    }
}
