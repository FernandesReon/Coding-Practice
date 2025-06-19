package Problem_Solving.simple_questions;

public class LargestNumber {
    public static void main(String[] args){
        largestNum(100, 100);
    }

    public static void largestNum(int num1, int num2){
        if (num1 > num2){
            System.out.println("Largest value is: " + num1);
        }
        else if (num2 > num1){
            System.out.println("Largest value is: " + num2);
        }
        else {
            System.out.println("Both values are equal.");
        }
    }
}
