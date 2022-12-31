package com.bridgelabzDay2;

import java.util.Scanner;

public class ForLoopReverseInteger {
    public static void main(String[] args) {
        int num , rev=0, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         num =sc.nextInt();


        for(;num != 0; num /= 10) {
            a = num % 10;
           rev=(rev*10)+a;
        }

        System.out.println("Reversed Number: " + rev);
    }
}

