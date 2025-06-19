package Problem_Solving.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Value: ");
        int value = input.nextInt();

        pattern3(value);
    }

    private static void pattern3(int value) {
        if (value < 1){
            System.out.println("Value cannot be zero");
        }

        for (int row = 1; row <= value; row++){
            for (int col = value; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
