/******************************************************
Multiplication table

Read an integer and print its multiplication table.
Sample I/O:
2
2*1=2
2*2=4
2*3=6
.
.
.
2*10=20
******************************************************/

import java.util.Scanner;

class MultiplyTable{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i < 11; i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
