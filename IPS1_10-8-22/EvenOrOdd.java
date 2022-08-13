/**********************************************************************
Even or Odd

Read a number and print whether it is even or odd using Java

Sample Input:
5

Sample Output
Odd Number
**********************************************************************/

import java.util.Scanner;

public class EvenOrOdd{
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