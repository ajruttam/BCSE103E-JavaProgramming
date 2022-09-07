/*********************************************************
Remove word from the sentence

Sample I/O:
The VIT Quick VIT Brown Fox VIT jumps VIT over VIT the mountain.
The Quick Brown Fox jumps over the mountain.
*********************************************************/

import java.util.Scanner;

class RemoveWord{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("VIT ","");
	    s = s.replaceAll(" VIT","");
        System.out.println(s);
    }
}