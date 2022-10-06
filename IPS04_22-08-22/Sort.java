/**********************************************************
Sort the given array

Write a Java program to sort the given array.
Sample I/O:
6
12 2 3 5 78 21
2 3 5 12 21 78
**********************************************************/
import java.util.Scanner;

class Sort{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
    
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i< n; i++)
            System.out.print(arr[i]+" ");
    }
}
