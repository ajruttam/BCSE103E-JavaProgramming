/*************************************************************************************
Implementation of Generic Stack using ArrayList
Create a GenericStack that can hold 1) Integers 2) Doubles 3) Strings. 
Implement push(element), pop(), peek(), isEmpty(), size() methods tooperate the stack. 
Call methods in sequence as per the test case.

Test Case:

Input
30 40 50 60 80 90
100
America Africa India Italy Srilanka Pakistan
Japan
25.8 36.5 69.2 36.45 36.21 30.21
36.25

Expected output
Stack Contents: 30 40 50 60 80 90
Stack Push done
Stack Contents: 30 40 50 60 80 90 100
Stack is Popped: 100
Stack is Popped: 90
Stack Contents: 30 40 50 60 80
Stack Contents: America Africa India Italy Srilanka Pakistan
Stack Push done
Stack Contents: America Africa India Italy Srilanka Pakistan Japan
Stack is Popped: Japan
Stack is Popped: Pakistan
Stack Contents: America Africa India Italy Srilanka
Stack Contents: 25.8 36.5 69.2 36.45 36.21 30.21
Stack Push done
Stack Contents: 25.8 36.5 69.2 36.45 36.21 30.21 36.25
Stack is Popped: 36.25
Stack is Popped: 30.21
Stack Contents: 25.8 36.5 69.2 36.45 36.21
*************************************************************************************/

import java.util.*;

class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();
    
    GenericStack(ArrayList<E> a){
        list = a;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }
    public void push(E ele){
        list.add(ele);
        System.out.println("Stack Push done");
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("Stack is Popped: " + list.get(list.size()-1));
            list.remove(list.size() - 1);
        }
    }
    public E peek(){
        return list.get(list.size()-1);
    }
    public void print(){
        System.out.print("Stack Contents: ");
        for (int i = 0; i < list.size(); i++){
            if (i != list.size() - 1)
                System.out.print(list.get(i) + " ");
            else
                System.out.println(list.get(i));
        }
    }
}

public class GENERICStack{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> I = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            int n = sc.nextInt();
            I.add(n);
        }
        GenericStack <Integer> iObj= new GenericStack(I);
        iObj.print();
        int n = sc.nextInt();
        iObj.push(n);
        iObj.print();
        iObj.pop();
        iObj.pop();
        iObj.print();
        
        ArrayList<String> S = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            String s = sc.next();
            S.add(s);
        }
        GenericStack <String> sObj= new GenericStack(S);
        sObj.print();
        String s = sc.next();
        sObj.push(s);
        sObj.print();
        sObj.pop();
        sObj.pop();
        sObj.print();
        
        ArrayList<Double> D = new ArrayList<>();
        for (int i = 0; i< 6;i++){
            Double d = sc.nextDouble();
            D.add(d);
        }
        GenericStack <Double> dObj= new GenericStack(D);
        dObj.print();
        Double d = sc.nextDouble();
        dObj.push(d);
        dObj.print();
        dObj.pop();
        dObj.pop();
        dObj.print();
    }
}
