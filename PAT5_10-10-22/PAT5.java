/**********************************************************************
XYZ Shop announces exclusive offer sale for three products 1. Shoes 2. Perfume 
3.Chocolate. Implement readData(Scanner) -  to read the Product name, qty and price
from each user, and calculate the amount, printData()- print the bill. The offer is
as follows, 50% off in the bill when the product bought is Shoes, 30% off for perfumes,
20% off for chocolates. The customer is restricted to choose the products into shopping
cart based on the following conditions. 1) Customer can't buy more than one Shoe.
2) Bill amount can't exceed 1500 while buying Perfumes 3) Customer can't buy
more than 20 Chocalates.  Create InvalidChoiceException class. 
Raise InvalidChoiceExcepion if the user is voilating the restrictions while choosing
products.

(Assume customer buys only one product at a time)

Hint: Raise all the exceptions inside readData() method
***********************************************************************/

import java.util.*;

class InvalidChoiceException extends Exception{
    InvalidChoiceException(String m){
        super(m);
    }
}

class XYZ{
    String name;
    int quantity;
    double price;

    public void printData(){
        System.out.println("Product Name:" + name);
        System.out.println("Quantity:" + quantity);
        System.out.println("Price:" + price);
        System.out.println("Bill Amount:" + quantity*price);
    }

    public void readData(Scanner sc){
        name = sc.next();
        if (name.equals("Chocolate")){
            quantity = sc.nextInt();
            try{
                if (quantity > 20)
                    throw new InvalidChoiceException("You can not choose more than 20 Chocolates");
                price = sc.nextDouble();
                printData();
            }
            catch (InvalidChoiceException e){
                System.out.println(e);
            }
        }
        else if (name.equals("Shoe")){
            quantity = sc.nextInt();
            try{
                if (quantity > 1)
                    throw new InvalidChoiceException("You can not buy more than one Shoe");
                price = sc.nextDouble();
                printData();
            }
            catch (InvalidChoiceException e){
                System.out.println(e);
            }
        }
        else{
            quantity = sc.nextInt();
            price = sc.nextDouble();
            double amount = quantity * price;
            try{
                if (amount > 1500)
                    throw new InvalidChoiceException("Bill Amount can not exceed Rs.1500");
                printData();
            }
            catch (InvalidChoiceException e){
                System.out.println(e);
            }
        }
    }
}

public class Main{
    public static void main(String args []){
        //System.out.println("Chocolate\n5\nPrice:10.0\nBill Amount:50.0");
        Scanner sc = new Scanner(System.in);
        XYZ x = new XYZ();
        x.readData(sc);

    }
}