/***********************************************************************************
Divide by Zero

Read two integers m1 and m2. Divide m1 by m2 and print the quotient using the 
method int divide(int,int). If m2 is 0, raise an exception.
************************************************************************************/

import java.util.Scanner;

class DivideByZero{
    public static int divide(int m1, int m2) throws ArithmeticException{
        return m1/m2;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        try{
            System.out.println(divide(m1,m2));
        }
        catch (ArithmeticException ex){
            System.out.println("Exception: An integer can not be divided by Zero!");
        }
        
    }
}