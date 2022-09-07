/*********************************************************
Count Special Characters

Count the special characters in the given string (excluding spaces) using java program
Sample I/O:
India is&&& my*** Country!!!
9
*********************************************************/

import java.util.Scanner;

class CountSpecialChar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0;
        char [] arr = str.toCharArray();
        for (char e:arr)
        {
            if (!(e == ' ' || ((e >= 65 && e <= 90) || (e >= 97 && e <=122))))
                c++;
        }
        System.out.print(c);
    }
}