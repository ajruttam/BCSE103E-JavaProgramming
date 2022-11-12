// Another code for PAT7

import java.util.*;
class Ticket{

    int price,qty;
    Ticket(){
        price=250;
    }
    public void printBill(Scanner s2){
        System.out.println("Bill Amount:Rs."+qty*price);
    }
}
class Premium extends Ticket{
    int fc,amount;
    Premium(){
        price=250;}
    
    public void printBill(Scanner ss){
        qty=ss.nextInt();
        for(int i=0;i<qty;i++){
            fc=ss.nextInt();
            if(fc==1)
            amount+=800;
            else if(fc==2)
            amount+=500;
            else
            amount+=300;
        }
      //  System.out.println(amount);
        amount+=(qty*price)+(qty*250);
        System.out.println("Bill Amount:Rs."+amount);
    }
}
class Economic extends Ticket{
    int fc,amount;
    Economic(){
        price=250;
    }
    public void printBill(Scanner s1){
         //Scanner s1=new Scanner(System.in);
        qty=s1.nextInt();
        for(int i=0;i<qty;i++){
            fc=s1.nextInt();
            if(fc==1)
            amount+=800;
            else if(fc==2)
            amount+=500;
            else
            amount+=300;
        }
        amount+=(qty*price);
        System.out.println("Bill Amount:Rs."+amount);
    }
}
public class PAT7_1{
    public static void main(String s[]){
        Ticket T;
        int type;
        Scanner ip=new Scanner(System.in);
        type=ip.nextInt();
        if(type==1){
            T=new Premium();
            T.printBill(ip);
        }
        else if(type==2){
            T=new Economic();
            T.printBill(ip);
        }
    }
}