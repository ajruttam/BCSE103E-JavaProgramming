/***********************************************
Sum of Digits

Given an integer, print the sum of its digits.

Input:
Integer, n.
10000<=n<=99999

Output:
Sum of digits of the given integer n.

Example:
Input: 35243
Output: 17
***********************************************/

import java.util.Scanner;

class SumOfDigits{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n != 0){
            sum += n%10;
            n /= 10;
        }
        System.out.print(sum);
    }
}