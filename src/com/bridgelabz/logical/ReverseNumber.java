package com.bridgelabz.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int Number = sc.nextInt();
        System.out.println("Reverse Number:" + getRev(Number));
    }

    static int getRev(int x) {
        int rev = 0;
        while (x > 0) {
            int remainder = x % 10;
            rev = rev * 10 + remainder;
            x=x/10;
        }
        return rev;
    }
}

