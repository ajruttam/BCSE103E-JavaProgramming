/**********************************************************************
Factorial

Write a Program to calculate and print the factorial of given number.
n!=n*(n-1)*(n-2)*....*1

If the input is 0, print 1. Otherwise print the factorial of the given number.

Input:
Integer - n

Output:
Integer - Factorial of n
**********************************************************************/

import java.util.Scanner;

public class Factorial{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n%2 == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
}