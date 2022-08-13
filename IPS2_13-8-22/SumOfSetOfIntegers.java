/***********************************************
Sum of set of integers

Write a program to find sum of unspecified number of integers and display the sum.
Read a set of integers from user. You can stop calculating sum if the user enters 0.

2 2 2 2 2 2 2 0

14
***********************************************/

import java.util.Scanner;

class SumOfSetOfIntegers{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int sum = 0, x;
        do{
            x = s.nextInt();
            sum += x;
        } while(x != 0);
        System.out.print(sum);
    }
}