package com.reon;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int age = 24;
        System.out.println(age++);
        System.out.println(++age);
    }

    public static void nTo1(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        nTo1(n - 1);
    }

    public static void reverseNto1(int n) {
        if (n == 0) return;

        reverseNto1(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }

    public static int sumOfN(int n) {
        if (n == 0) return 0;

        return sumOfN(n / 10) + (n % 10);
    }
}