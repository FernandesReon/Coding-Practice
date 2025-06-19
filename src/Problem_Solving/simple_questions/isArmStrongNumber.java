package Problem_Solving.simple_questions;

public class isArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }

    public static boolean isArmStrong(int num){
        String numToStr = Integer.toString(num);
        int power = numToStr.length();
        int sum = 0;
        int originalNumber = num;

        while (num != 0){
            int digits = num % 10;
            sum += (int) Math.pow(digits, power);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
