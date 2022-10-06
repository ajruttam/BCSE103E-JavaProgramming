/*********************************************************
To check whether words in the given string is palindrome or not

Sample I/O:
madam is teaching ada language
madam
ada
*********************************************************/

import java.util.Scanner;

class PalindromesInSentence{
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++){
            if (str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        for (String s : arr){
            if (checkPalindrome(s))
                System.out.println(s);
        }
    }
}