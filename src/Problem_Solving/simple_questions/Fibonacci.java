package Problem_Solving.simple_questions;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int value){
        if (value == 0) return 0;
        if (value == 1) return 1;

        /*
        Using recursion
        return fibonacci(value - 1) + fibonacci(value - 2);
         */
        int first_term = 0, second_term = 1, index = 0;

        while (index < value){
            int next_term = first_term + second_term;
            first_term = second_term;
            second_term = next_term;
            index++;
        }
        return first_term;
    }
}
