/**********************************************************
Merge Sorted Arrays

Given two sorted arrays of different size, merge these arrays into a single sorted array.

Sample I/O:

5
12 18 26 27 32
8
8 10 15 28 36 45 78 96

Output:
8 10 12 15 18 26 27 28 32 36 45 78 96
**********************************************************/

import java.util.Scanner;

class MergeSortedArrays{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a1 [] = new int[n];
        for (int i = 0; i < n; i++)
            a1[i] = s.nextInt();
            
        int m = s.nextInt();
        int a2 [] = new int[m];
        for (int i = 0; i < m; i++)
            a2[i] = s.nextInt();
        
        int a3 [] = new int[m + n];
        int p1 = 0, p2 = 0, idx = 0;
        while (p1 < n && p2 < m){
            if (a1[p1] < a2[p2]){
                a3[idx] = a1[p1];
                p1++;
            }
            else
            {
                a3[idx] = a2[p2];
                p2++;
            }
            idx++;
        }
        while (p1 < n){
            a3[idx++] = a1[p1++];
        }
        
        while (p2 < m)
            a3[idx++] = a2[p2++];
        
        for (int i = 0; i < m + n; i++)
            System.out.print(a3[i] + " ");
        
        s.close();
    }
}