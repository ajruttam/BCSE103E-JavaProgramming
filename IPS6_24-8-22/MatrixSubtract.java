/*************************************************
Matrix Subtraction

Write a java program to print difference of two m X n matrices
*************************************************/

import java.util.Scanner;

class MatrixSubtract{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int arr1 [][] = new int[m][n];
        int arr2 [][] = new int[m][n];
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr1[i][j] = s.nextInt();
            }
        }
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr2[i][j] = s.nextInt();
            }
        }
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j != n-1)
                    System.out.print((arr1[i][j] - arr2[i][j]) + " ");
                else
                    System.out.println((arr1[i][j] - arr2[i][j]));
            }
        }
    }
}