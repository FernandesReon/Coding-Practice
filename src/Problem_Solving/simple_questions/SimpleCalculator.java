package Problem_Solving.simple_questions;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        simpleCalcy("/", 1, 0);
    }

    public static void simpleCalcy(String operator, int num1, int num2){
        double result;
        switch (operator){
            case "+":
                result = num1 + num2;
                System.out.print("Result: " + result);
                break;
            case "-":
                result = Math.abs(num1 + num2);
                System.out.print("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                try{
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
