/***********************************************************************************
Read until an integer is entered

Read an integer from the user and print it. If any input other than integer 
is entered, raise an exception to user saying "Invalid Input, Integer required" 
and continue to read from the user until he enters a valid integer.
************************************************************************************/

import java.util.*;

class ReadUntilIntegerEntered{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            try{
                n = sc.nextInt();
                System.out.println("The Number entered is " + n);
                break;
            }
            catch (InputMismatchException ex){
                sc.nextLine();
                System.out.println("Invalid Input, Integer required");
            }
            
        }while(true);
    }
}