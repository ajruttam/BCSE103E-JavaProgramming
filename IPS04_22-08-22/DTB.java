/********************************************************************
Decimal to Binary Conversion

Write a java program to convert the given decimal number to binary.
Sample Input:
7
Sample Output:
111
********************************************************************/

import java.util.Scanner;

class DTB{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long b = 0, multi = 1;
        while (n > 0){
            int r = n%2;
            b += r * multi;
            multi *= 10;    
            n /= 2;    
        }
        System.out.println(b);
    }
}
// test case: 7 - 111; 100 - 1100100