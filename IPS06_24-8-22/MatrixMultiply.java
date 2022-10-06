/*************************************************
Matrix Multiplication

Input
m n
A matrix of m X n size

p q
A matrix of p X q size

Output:
Product matrix of m X p size
If n and p are not equal, print Multiplication not possible
*************************************************/

import java.util.Scanner;

class MatrixMultiply{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int arr1 [][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr1[i][j] = s.nextInt();
        
        int p = s.nextInt();
        int q = s.nextInt();
        int arr2 [][] = new int[p][q];
        for (int i = 0; i < p; i++)
            for (int j = 0; j < q; j++)
                arr2[i][j] = s.nextInt();
        if (n == p){
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < q; j++)
                {
                    int sum = 0;
                    for (int k = 0; k < n; k++)
                        sum += arr1[i][k] * arr2[k][j];
                        
                    if (j != q - 1)
                        System.out.print((sum) + " ");
                    else
                        System.out.println((sum));
                }
            }    
        }
        else
            System.out.println("Multiplication not possible");
        
        s.close();
    }
}