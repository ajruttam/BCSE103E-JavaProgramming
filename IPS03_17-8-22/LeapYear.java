/******************************************************
Leap Year using Java

Write a Java Program to check whether the given year is leap year or not.

Examples:

Input
2000
Output
Leap Year

Input 
2006
Output
Not a Leap Year
******************************************************/

import java.util.Scanner;

class LeapYear{
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (((n%4 == 0) && n%100 != 0) || n%400 == 0)
            System.out.print("Leap Year");
        else
            System.out.print("Not a Leap Year");
        input.close();
    }
}