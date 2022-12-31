package com.bridgelabzDay2;
import java.util.*;
public class ForLoopPalindromeNumber {
    public static void main(String[] args) {
        int t , s , rem;
        Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num= sc.nextInt();
            t=num;
            for (s=0;num>0;num/=10)
            {
                rem=num%10;
                s=(s*10)+rem;
            }
            if (s==t){
                System.out.println("Yes, it is palindrome");
            }
            else{
                System.out.println("No, it is not palindrome");
            }
        }
    }


//Math.sqrt(Math.pow(x2 - x1, 2)
//                         + Math.pow(y2 - y1, 2) * 1.0);