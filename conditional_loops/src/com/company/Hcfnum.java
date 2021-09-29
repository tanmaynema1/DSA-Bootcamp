package com.company;

import java.util.Scanner;

public class Hcfnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int min = 0;

        int hcf = 1;

        if(num1 > num2){
            min  = num2;
        }
        else {
            min = num1;
        }

        for(int i = 0;i <= min;i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
                break;
            }
            System.out.println("The hcf of the two numbers is: " + hcf);
        }
    }
}
