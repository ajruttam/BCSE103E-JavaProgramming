/**********************************************************
Insert Element in an Array

Write a Java program to insert a new element in the particular position. (Create array of size - n+1)

Sample I/O:

6 - n
12 23 25 28 45 68 - elements
3 - position
15 - new element

Output:
12 23 15 25 28 45 68
**********************************************************/

import java.util.Scanner;

class InsertElement{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n+1];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        
        int pos = s.nextInt();
        int ele = s.nextInt();
        
        for (int i = n; i >= 0; i--){
            if (i > pos - 1)
                arr[i] = arr[i - 1];
            else if (i == pos - 1) 
                arr[i] = ele;
        }
        
        for (int i = 0; i < n + 1;i++)
            System.out.print(arr[i] + " ");
            
        s.close();
    }
}