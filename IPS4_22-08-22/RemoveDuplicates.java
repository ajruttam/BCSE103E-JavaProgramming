/*******************************************************
Remove Duplicates from a sorted array

Write a Java program to remove duplicate elements from a sorted array.
Sample I/O
7
1 1 2 2 2 3 3
1 2 3
*******************************************************/
import java.util.Scanner;

class RemoveDuplicates{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        
        int sh = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] < arr[i + 1]){
                sh++;
                arr[sh] = arr[i + 1];
            }
        }
        
        for (int i = 0; i <= sh; i++){
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
