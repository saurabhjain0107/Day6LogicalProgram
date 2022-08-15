package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        int count = 0;
        if(num<=1)
            count++;
        for(int i =2; i<=num /2;i++){
            if (num % i ==0){
                count++;
            }
        }
        if (count>0)
            System.out.println("Number is not prime");
        else
            System.out.println("The Number is Prime");
    }
}
