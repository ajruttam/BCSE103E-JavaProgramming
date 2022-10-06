/**************************************************************
counting number of vowels, consonants, spaaces and special characters
Sample I/O:
India is my country!
Output:
Vowels: 6
Consonants: 10
Special Character: 1
Spaces: 3
**************************************************************/

import java.util.Scanner;
class CountingCharacters{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        char [] ch = str.toCharArray();
        int cs = 0, cv = 0, csp = 0, cc= 0;
        for (int i = 0; i < n; i++){
            if (ch[i] == ' ')
                cs++;
            else if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)){
                if (checkVowel(ch[i]))
                    cv++;
                else
                    cc++;
            }
            else
                csp++;
        }
        System.out.println("Vowels: " + cv);
        System.out.println("Consonants: " + cc);
        System.out.println("Special Character: " + csp);
        System.out.println("Spaces: " + cs);
        
    }
    public static boolean checkVowel(char a){
        if (a == 'a' || a == 'e' || a == 'i' || a =='o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            return true;
        }
        else
            return false;
    }
}