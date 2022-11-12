// Another code for PAT 5


import java.util.*;
class InvalidChoiceException extends Exception{
    public InvalidChoiceException(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int qty;
    double price;
    double amount;
    void readData(Scanner sc)throws InvalidChoiceException{
        name=sc.next();
        qty=sc.nextInt();
        price=sc.nextDouble();
        amount=price*qty;
        if(name.equals("Shoe")&&qty>1)
        throw new InvalidChoiceException("You can not buy more than one Shoe");
        else if(name.equals("Perfume")&&amount>1500)
        throw new InvalidChoiceException("Bill Amount can not exceed Rs.1500");      
        else if(name.equals("Chocolate")&&qty>20) 
        throw new InvalidChoiceException("You can not choose more than 20 Chocolates");
        printData();
    }
    void printData(){
        System.out.println("Product Name:"+name);
        System.out.println("Quantity:"+qty);
        System.out.println("Price:"+price);
        System.out.println("Bill Amount:"+amount);
        
    }
    
}

public class PAT5_1{
    public static void main(String s[]){
		Product p1=new Product();
        Scanner ip=new Scanner(System.in);
        try{
            p1.readData(ip);
        }
        catch (InvalidChoiceException e){
            System.out.println(e);
        }
    }
}