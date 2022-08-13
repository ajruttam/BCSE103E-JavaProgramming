/***********************************************
Sum of elements in Array

Create an array of size n and read values for array. Iterate through array and calculate the sum of elements in array. Print the sum.

Input:
Integer, n.
Set of n integers.

Output:
Print the sum of Array.

Sample Input:
6
5 14 15 20 18 36

Sample Output:
108
***********************************************/

import java.util.Scanner;

class SumOfElementsInArray{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        
        System.out.print(sum);
    }
}