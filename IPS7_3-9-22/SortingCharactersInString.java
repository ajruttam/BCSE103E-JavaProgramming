/**************************************************************
Sorting characters in a String
Read a string, sort the characters present in the string in alphabetical order.
Sample I/O:
apple
aelpp
**************************************************************/

import java.util.Scanner;

class SortingCharactersInString{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        char [] ch = str.toCharArray();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (ch[j] > ch[j + 1]){
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        String ans = new String(ch);
        System.out.println(ans);
    }
}