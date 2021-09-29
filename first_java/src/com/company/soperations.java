package com.company;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class soperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();
        System.out.println("Input the second number: ");
        int num2 = input.nextInt();
        System.out.println("Input the Operator (+,-,*,/): ");
        String op = input.next();
        double result = 0;

        if(op.equals("+")){
            result = num1 + num2;
        }
        else if(op.equals("-")){
            result = num1 - num2;
        }
        else if(op.equals("*")){
            result = num1 * num2;
        }
        else if(op.equals("/")){
            result = num1 / num2;
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println("The result is " + result);
    }
}
