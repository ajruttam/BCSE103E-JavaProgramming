/**************************************************************
Anagram or not
Check whether two strings are anagrams to each other using a java program.
Two strings are said to be anagram if we can form one string by arranging the characters of another string.
Example:
silent and listen are anagrams
triangle and integral are anagrams
**************************************************************/

import java.util.Scanner;
import java.util.Arrays;

class Anagram{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String astr1 = new String(ch1);
        String astr2 = new String(ch2);
        
        if (astr1.equals(astr2)){
            System.out.println("Two strings are Anagrams");
        }
        else{
            System.out.println("Two strings are not Anagrams");
        }
        
    }
}