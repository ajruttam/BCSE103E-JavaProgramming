/******************************************************
Surprise Chocolate Plan

Kids Play school is planning for a slow walk race for 'n' children. The kid who touches the finishing 
line first gets 0 chocolate. The second kidgets 1 chocolate. The numer of chocolates the third kid gets 
is the sum of chocolates given to first and second kid. Fourth kid gets sum ofchocolates of second and 
third kids and it goes on. Print the number of chocolates got by each kid.

Sample Input:
5 - Number of Children - Integer
Sample Output:
0 1 1 2 3
******************************************************/

import java.util.Scanner;

class FiboChoco{
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fibo [] = new int [n];
        fibo[0] = 0; fibo[1] = 1;
        for (int i = 2; i < n;i++)
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        
        for (int i = 0; i < n; i++)
            System.out.print(fibo[i] + " ");
            
        input.close();
    }
}