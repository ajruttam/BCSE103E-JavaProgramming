/**************************************************************
Frequency of Characters in a String
Read a string, print the number of times each character is appearing in the string using Java.
Sample I/O:
intellectual ability
i: 3
n: 1
t: 3
e: 2
l: 4
c: 1
u: 1
a: 2
b: 1
y: 1
**************************************************************/

import java.util.Scanner;

class FrequencyOfCharactersInString{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        char [] ch = str.toCharArray();
        for (int i = 0; i < n; i++){
            boolean f = true;
            for (int j = 0; j < i; j++){
                if (ch[i] == ch[j]){
                    f = false;
                    break;
                }
            }
            
            if (f && ch[i] != ' '){
                int count = 0;
                for (int j = i; j < n; j++){
                    if (ch[i] == ch[j])
                        count++;
                }
                System.out.println(ch[i] + ": " + count);
            }
        }
    }
}