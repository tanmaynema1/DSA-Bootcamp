package com.company;

import java.util.Scanner;

// Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.

public class sinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float p = input.nextFloat();
        System.out.println("Enter Time in years: ");
        float t = input.nextFloat();
        System.out.println("Enter Rate in percentage: ");
        float r = input.nextFloat();

        float sin = p*(1+(r*t));

        System.out.println("The final amount is: " + sin);
    }
}
