package Problem_Solving.patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Value: ");
        int value = input.nextInt();

        pattern4(value);
    }

    private static void pattern4(int value) {
        if (value < 1){
            System.out.println("Value cannot be zero");
        }

        for (int row = 1; row <= value; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
