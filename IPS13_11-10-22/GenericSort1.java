/*************************************
Another way of Sorting
*************************************/

import java.util.*;

class GenericSort1<E extends Comparable>{
    private ArrayList<E> list = new ArrayList<>();
  
    public void add(E obj) {
        list.add(obj);
    }

    public void sort(){
        for (int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - i - 1; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0){
                    E temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);

                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < list.size(); i++){
            if (i != list.size() - 1)
                System.out.print(list.get(i) + " ");
            else
                System.out.println(list.get(i));
        }
    }
}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GENERICSort <Integer> iObj= new GENERICSort();
        for (int i = 0; i< n;i++){
            int a = sc.nextInt();
            iObj.add(a);
        }
        iObj.sort();
        iObj.print();
    }
}
