package com.company;

import java.util.Scanner;

public class Candp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = in.nextInt();
        System.out.println("Input r: ");
        int r = in.nextInt();
        int fn = 1;
        int fr = 1;
        int fnr = 1;

        for(int i = 1; i <= n; i++){
            fn = fn*i;
        }

        for(int i = 1; i<=r; i++){
            fr = fr*i;
        }

        for(int i = 1; i<=n-r; i++){
            fnr = fnr*i;
        }

        int ncr = fn/(fr*fnr);
        int npr = fn/(fnr);

        System.out.println("Combination: " + ncr);
        System.out.println("Permutation: " + npr);
    }
}
