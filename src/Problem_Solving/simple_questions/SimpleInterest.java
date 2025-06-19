package Problem_Solving.simple_questions;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        long amount = input.nextLong();

        System.out.print("Time (eg: 10 [years]): ");
        int time = input.nextInt();

        System.out.print("Interest rate: ");
        float rate = input.nextFloat();

        long result = simpleInterest(amount, time, rate);
        System.out.println("Simple Interest: " + result);
    }

    public static long simpleInterest(long principle, int time, float rate){
        return (long) (principle * time * rate) / 100;
    }
}
