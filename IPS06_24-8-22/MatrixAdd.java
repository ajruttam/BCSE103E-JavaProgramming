/*************************************************
Matrix Addition

Write a java program to add two matrices

Input
3 3 - m,n

1 3 4
2 4 3
3 4 5

1 3 4
2 4 3
1 2 4

Output:
2 6 8
4 8 6
4 6 9
*************************************************/

import java.util.Scanner;

class MatrixAdd{
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
                    System.out.print((arr1[i][j] + arr2[i][j]) + " ");
                else
                    System.out.println((arr1[i][j] + arr2[i][j]));
            }
        }
    }
}