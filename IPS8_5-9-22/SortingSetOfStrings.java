/*********************************************************
Sorting set of Strings

Read n - number of strings, set of 'n' strings. Display the sorted list of strings using Java.

Sample I/O:
5
India
america
japan
mexico
switzerland

Output:
america
india
japan
mexico
switzerland
*********************************************************/

import java.util.Scanner;
import java.util.Arrays;

class SortingSetOfStrings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr [] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        Arrays.sort(arr);
        for (String a: arr)    
            System.out.println(a);
    }
}