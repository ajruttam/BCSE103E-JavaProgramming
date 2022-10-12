/********************************************************************************
Generic Sort

Implement a generic method to sort an array of n generic elements in ascending order.

Sample Input
5
20 14 65 78 25
6
12.14 21.10 245.24 8.2 7.2 69.2
4
Son Hen Den Que

Sample Output
14 20 25 65 78
7.2 8.2 12.14 21.10 69.2 245.24
Den Hen Que Son
********************************************************************************/

import java.util.*;

public class GENERICSort{
    public static <E  extends Comparable<? super E>> void sort(E [] a){
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length - i - 1;j++){
                if (a[j+1].compareTo(a[j])<0){
                    E temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    public static <E> void print(E [] list){
        for (int i = 0; i < list.length; i++){
            if (i != list.length - 1)
                System.out.print(list[i] + " ");
            else
                System.out.println(list[i]);
        }
    }

    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] iObj = new Integer[n];
        for (int i = 0; i<n;i++){
            iObj[i] = sc.nextInt();
        }
        sort(iObj);
        print(iObj);
        
        n = sc.nextInt();
        Double [] dObj = new Double[n];
        for (int i = 0; i<n;i++){
            dObj[i] = sc.nextDouble();
        }
        
        sort(dObj);
        print(dObj);
        
        n = sc.nextInt();
        String [] sObj = new String[n];
        for (int i = 0; i<n;i++){
            sObj[i] = sc.next();
        }
        sort(sObj);
        print(sObj);
    }
}
