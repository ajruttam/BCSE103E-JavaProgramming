/****************************************************************
Examine Set of Integers

Read an array of 'n' integers, check whether each integer is a prime number or not. If any given number is 0 or 1, 
display "It is neither prime nor composite". Also print the numbers which are perfect numbers in the given list. 
Also print the sum of even numbers and odd numbers from the given list.
Perfect Number - a number that is equal to the sum of its proper divisors.
Prime Number - a number that can be divided exactly only by itself and 1
Sample Input:
8
1 23 6 9 41 0 71 74
Sample Output
1 is neither prime nor composite
23 is a prime number
6 is not a prime number
9 is not a prime number
41 is a prime number
0 is neither prime nor composite
71 is a prime number
74 is not a prime number
Perfect Numbers:
6
Even Sum:80
Odd Sum:145
***************************************************************/

import java.util.Scanner;

public class PAT1FN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] perfect = new int[n];
        int es = 0, os = 0, p = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (arr[i] == 0 || arr[i] == 1){
                System.out.println(arr[i] + " is neither prime nor composite");
            }
            else{
                int sf = 0;  //sum of factors
                for (int j = 1; j <= arr[i]; j++){
                    if (arr[i]%j == 0)
                        sf += j;
                }
                if (sf == arr[i] + 1)  //prime number is a number if it has only 1 and that number as factor
                    System.out.println(arr [i] + " is a prime number");
                else
                    System.out.println(arr [i] + " is not a prime number");
                if (sf == 2 * arr[i] && arr[i] != 0) // perfect number is a number which equals to the sum of it's factors
                    perfect[p++] = arr[i];
            }
            if (arr[i]%2 == 1) os += arr[i];
            else es += arr[i];

        }
        System.out.println("Perfect numbers:");
        for (int i = 0; i < p; i++){
            System.out.println(perfect[i]);
        }
        System.out.println("Even Sum:" + es);
        System.out.println("Odd Sum:" + os);
        sc.close();
    }
}
