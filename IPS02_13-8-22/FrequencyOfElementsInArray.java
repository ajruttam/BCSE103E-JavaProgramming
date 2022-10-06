/***********************************************
Frequency of elements in an Array

Print the number of occurances of all elements in the given array.

Input:
n: Integer, size of the Array
Set of n integers

Output:
Number of occurances of each element in the array

Sample Input:
6
12
1
25
1
26
12

Sample Output
12 is occuring 2 times
1 is occuring 2 times
25 is occuring 1 times
26 is occuring 1 times
***********************************************/

import java.util.Scanner;

class FrequencyOfElementsInArray{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        
        for (int i = 0; i < n; i++)
        {
            int c = 1;
            boolean f = true;
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    f = false;
                    break;
                }
            }
            
            if (f){
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] == arr[j])
                        c++;
                }
                System.out.println(arr[i]+" is occuring "+c+" times");
            }
        }
        s.close();
    }
}