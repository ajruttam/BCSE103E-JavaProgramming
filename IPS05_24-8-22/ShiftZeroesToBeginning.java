/**********************************************************
Shift Zeroes to beginning

Write a java program to push the zeroes to the beginning of the array.

Sample I/O:
11
12 25 0 0 2 0 6 8 0 18 0
0 0 0 0 0 12 25 2 6 8 18
**********************************************************/

import java.util.Scanner;

class ShiftZeroesToBeginning{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
            
        int z = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0)
            {
                for (int j = i; j > z; j--)
                    arr[j] = arr[j - 1];
                
                arr[z] = 0;
                z++;    
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        s.close();
    }
}