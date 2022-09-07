/*********************************************************
Palindrome Check

Sample I/O:
Madam
Palindrome

India
Not Palindrome
*********************************************************/

import java.util.Scanner;

class Palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean f = true;
        for (int i = 0; i < n/2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)){
                f = false;
                System.out.println("Not Palindrome");
                break;
            }
        }
        if (f)
            System.out.println("Palindrome");
    }
}