/*********************************************************
Design an application to validate the username and password of a user.
Read the username and password as strings, if the username is valid and password is correct, then display, "Welcome, Username". 
Display "Invalid Username", if the username is invalid. Display "Wrong Password", if the password is wrong.
Valid Username must be:
1) Minimum - 8 characters, maximum - 32 characters
2) Can contain alphabets (a-z, A-Z)  and digits(0-9).
3) The only special character allowed is underscore _.
4) Username must start with an alphabet.
The allowed passwords are
admin123
VITadmin! 
StudScope153*
Validate the password, only if the username is valid.
Sample I/O:
123user
admin123
Invalid Username

Raj123!
admin123
Invalid Username

Anand1991_scope
VITadmin!
Welocome,Anand1991_scope

Priya_Scope23
admin123!
Wrong Password
********************************************************/

import java.util.*;

public class PAT2{
    public static boolean checkUser(String ss){
        if(!(ss.length()>=8&&ss.length()<=32))
            return false;
        else{
            if(!(Character.isLetter(ss.charAt(0))))
                return false;
            else{
                for(int i=0;i<ss.length();i++)
                {
                    if(!(Character.isLetter(ss.charAt(i))||Character.isDigit(ss.charAt(i))||ss.charAt(i)=='_'))
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkPass(String ss)
    {
        if(ss.equals("admin123")||ss.equals("VITadmin!")||ss.equals("StudScope153*"))
        return true;
        else
        return false;
    }
    public static void main(String s[])
    {
        Scanner ip=new Scanner(System.in);
        String s1=ip.nextLine();
        String s2=ip.nextLine();
        if(checkUser(s1)){
            if(checkPass(s2))
                System.out.println("Welcome,"+s1);
            else
                System.out.println("Wrong Password");
        }
        else
            System.out.println("Invalid Username");
    }
}