package com.company;

import java.util.Scanner;

public class primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = input.nextInt();
        System.out.println(num1+num2);
    }
}
