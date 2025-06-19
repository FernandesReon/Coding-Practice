package Problem_Solving.simple_questions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        EvenOrOdd check = new EvenOrOdd();

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        check.evenOrOdd(number);
    }

    public void evenOrOdd(int num){
        if ((num & 1) == 1) {
            System.out.println("Odd number.");
        }
        else {
            System.out.println("Even number.");
        }
        /*
        if the last bit is 1 then provided number is odd
        else if the last bit is 0 then it's even
         */
    }
}
