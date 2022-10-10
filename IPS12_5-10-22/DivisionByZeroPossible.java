/***********************************************************************************
Make Division by Zero possible

Read two numbers from user. Perform division operation and print the output. 
In the hidden testcase, the dividend is a valid number andthe divisor is zero. 
In spite of divisor being zero, your code should not raise exception. How can you do that?
************************************************************************************/

import java.util.Scanner;

public class DivisionByZeroPossible{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println(n1/n2);
    }
}