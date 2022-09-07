/*********************************************************
Toggle String

Sample I/O:
Queen ViCToRiA
qUEEN vIctOrIa
*********************************************************/

import java.util.Scanner;

class ToggleString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ts = "";
        for (int i = 0; i < str.length(); i++)
        {
            char e = str.charAt(i);
            if (e >= 'A' && e <= 'Z')
                ts += (char) (e + 32);
            else if (e >= 'a' && e <= 'z')
                ts += (char)(e - 32);
            else
                ts += e;
        }
        System.out.print(ts);
    }
}