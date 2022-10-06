/******************************************************************
Design a class called Product to store the details of Products added to a shopping cart. 
Include necessary instance variables to define the properties of Product such as product number, 
name, category, quantity, price etc., Include the required constructors to initialize objects. 
Define instance methods readProd(), printProd() to read and print the details of Product objects. 
The maximum quantity that can be ordered in each product is 3. Define a private instance method 
to check the quantity limit. If the qty exceeds the limit, change the qty to 3. 
Define another instance method that takes objects as arguments to print the total bill amount. 
Create two objects C1 and C2 as specified below. 
C1() - no arguments sent 
C2(100,"Note", "Stationery", 50.00,3) 
Sample Output:
99 Biscut Grocery 45.0 7
Output:
99 Biscut Grocery 45.0 3 
100 Note Stationery 50.0 3
Bill Amount: Rs. 285.0
******************************************************************/

import java.util.Scanner;

class Product{
    private int prodno;
    private String name, category;
    private double price;
    private int quantity;
    static double bill = 0;
    private void checkQ(){
        if (quantity > 3)
            quantity = 3;
    }
    Product(){
        prodno = 0;
        name = category = "*";
        price = 0.0;
        quantity = 0;
    }
    Product(int p,String n, String c, double pr, int q){
        prodno = p;
        name = n;
        category = c;
        price = pr;
        quantity = q;
        this.checkQ();
        bill += q * price;
    }
    public void readProd(Scanner sc){
        prodno = sc.nextInt();
        name = sc.next();
        category = sc.next();
        price = sc.nextDouble();
        quantity = sc.nextInt();
        this.checkQ();
        bill += quantity * price;
    }
    public void printProd(){
        System.out.println(prodno + " " + name + " " + category + " " + price + " " + quantity);
    }
    public void total(){
        System.out.println("Bill Amount: Rs. " + bill);
    }
}

public class PAT3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Product c1 = new Product();
        c1.readProd(s);
        c1.printProd();
        Product c2 = new Product(100,"Note", "Stationery", 50.00,3);
        c2.printProd();
        c2.total();
    }
}
