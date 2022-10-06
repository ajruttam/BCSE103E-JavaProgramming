/******************************************************
Factors of number using Java

Write a Java program to print the factors of a given number.

Sample Input:
144
Sample Output:
1 2 3 4 6 8 9 12 16 18 24 36 48 72 144
******************************************************/

import java.util.Scanner;

class Factors{
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            if (n%i == 0)
                System.out.print(i+" ");
        }
        input.close();
    }
}