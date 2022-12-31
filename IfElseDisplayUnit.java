package com.bridgelabzDay2;
import java.util.Scanner;
public class IfElseDisplayUnit {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        //Prompt user to input 3 digit number
        System.out.print("Enter a 3 digit number: ");
        int number = input.nextInt();

        //Displays hundreds place digit
        hundreds = number / 100;
        System.out.printf("Hundreds place digit: ", hundreds);

        //Displays tens digit
        tens = (number - hundreds) / 10;
        System.out.printf("\nTens place digit: ", tens);


        //Display ones digit
        ones = (number - tens - hundreds);
        System.out.printf("\nOnes place digit: ", ones);
    }
}
