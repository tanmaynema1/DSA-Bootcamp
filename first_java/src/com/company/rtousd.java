package com.company;

import java.util.Scanner;

public class rtousd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rupees: ");
        double rupees = input.nextDouble();

        double dollars = (rupees / 77.73);

        System.out.println("The dollar value: " + dollars);

    }
}
