package com.company;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year: ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 == 0){
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}
