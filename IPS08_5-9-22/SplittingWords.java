/*********************************************************
Splitting words from a sentence

(There may be multiple spaces in a word)
Sample I/O:
India is my country
India
is
my
country
*********************************************************/

import java.util.Scanner;

class SplittingWords{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] sa = s.split("[ ]+");
        for (String e: sa){
                System.out.println(e);
        }
        sc.close();
    }
}