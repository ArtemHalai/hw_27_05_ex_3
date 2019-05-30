package com.epam.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        countBits(number);
    }

    private static void countBits(long number) {

        int count = 0;

        while (number!=0){
            count++;
            number>>=1;
        }

        System.out.println(count);
    }
}
