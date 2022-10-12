/********************************************************************************
Generic Queue using ArrayList

Implement a Generic Queue using ArrayList

Input
30 40 50 60 80 90
100
America Africa India Italy Srilanka Pakistan
Japan
25.8 36.5 69.2 36.45 36.21 36.21
36.25

Expected output
Queue is: 30 40 50 60 80 90
Queue insert done
Queue is: 30 40 50 60 80 90 100
Queue is deleted: 30
Queue is deleted: 40
Queue is: 50 60 80 90 100
Queue is: America Africa India Italy Srilanka Pakistan
Queue insert done
Queue is: America Africa India Italy Srilanka Pakistan Japan
Queue is deleted: America
Queue is deleted: Africa
Queue is: India Italy Srilanka Pakistan Japan
Queue is: 25.8 36.5 69.2 36.45 36.21 36.21
Queue insert done
Queue is: 25.8 36.5 69.2 36.45 36.21 36.21 36.25
Queue is deleted: 25.8
Queue is deleted: 36.5
Queue is: 69.2 36.45 36.21 36.21 36.25
********************************************************************************/

import java.util.*;

class GenericQueue<E>{
    private ArrayList<E> list = new ArrayList<>();
    
    GenericQueue(ArrayList<E> a){
        list = (ArrayList)a.clone();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }
    
    public void insert(E ele){
        list.add(ele);
        System.out.println("Queue insert done");
    }
    
    public void delete(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("Queue is deleted: " + list.get(0));
            list.remove(0);
        }
    }
    public E peek(){
        return list.get(0);
    }
    public void print(){
        System.out.print("Queue is: ");
        for (int i = 0; i < list.size(); i++){
            if (i != list.size() - 1)
                System.out.print(list.get(i) + " ");
            else
                System.out.println(list.get(i));
        }
    }
}

public class GENERICQueue{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> I = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            int n = sc.nextInt();
            I.add(n);
        }
        GenericQueue <Integer> iObj= new GenericQueue(I);
        iObj.print();
        int n = sc.nextInt();
        iObj.insert(n);
        iObj.print();
        iObj.delete();
        iObj.delete();
        iObj.print();
        
        ArrayList<String> S = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            String s = sc.next();
            S.add(s);
        }
        GenericQueue <String> sObj= new GenericQueue(S);
        sObj.print();
        String s = sc.next();
        sObj.insert(s);
        sObj.print();
        sObj.delete();
        sObj.delete();
        sObj.print();
        
        ArrayList<Double> D = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            Double d = sc.nextDouble();
            D.add(d);
        }
        GenericQueue <Double> dObj= new GenericQueue(D);
        dObj.print();
        Double d = sc.nextDouble();
        dObj.insert(d);
        dObj.print();
        dObj.delete();
        dObj.delete();
        dObj.print();
    }
}
