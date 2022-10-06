/******************************************************
LCM of two numbers

Write a Java program to find the LCM of two numbers.

Sample Input:
72 120
Sample Output
360
******************************************************/

import java.util.Scanner;

class LCM{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int x = n1, y = n2;
        while (n1 != n2){
            if (n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }
        System.out.print(x*y/n1);
        s.close();
    }
}