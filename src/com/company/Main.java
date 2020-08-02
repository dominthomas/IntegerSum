package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Integer");
        Scanner reader = new Scanner(System.in);
        // Assuming this is an integer, not any longer.
        int num = reader.nextInt();
        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int num) {
        return num == 0 ? 0 : num % 10 +
                sumDigits(num / 10);
    }
}
