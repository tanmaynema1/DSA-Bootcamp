package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int rev = 0;
        int temp = num;

        while (num > 0){
            int rem = num % 10;
            num /= 10;

            rev = rev * 10 + rem;
        }

        if (rev == temp){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

    }
}
