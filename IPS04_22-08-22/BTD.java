/***********************************************************************
Binary to Decimal Conversion

Write a Java Program to convert the given binary number into decimal.
Sample Input:
1010
Output:
10
************************************************************************/

import java.util.Scanner;

class BTD{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 0, multi = 1;
        while (n > 0){
            int r = n%10;
            d += r * multi;
            multi *= 2;    
            n /= 10;    
        }
        System.out.println(d);
        s.close();
    }
}
