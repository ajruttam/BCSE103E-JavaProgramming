/***********************************************************************************
Small Value Exception
Read a value from the user. If the value is less than 30, throw an exception 
"Value too small". Otherwise print the value. Print "VIT University" regardless of 
whether exception is generated or not.
************************************************************************************/

import java.util.*;

class SmallValueException{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            if (n < 30)
                throw new Exception("Exception: Value too small");
            else
                System.out.println("The value is " + n);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("VIT University");
        }
    }
}