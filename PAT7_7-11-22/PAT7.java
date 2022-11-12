/************************************************************************
Movie Ticket Booking - Dynamic Polymorphism
Create a super class to store the basic details of a movie ticket - quantity and price. 
The basic price of each movie ticket is Rs.250/-. Define calcBill() method to read quantity 
and display the bill amount. Type of movie ticket is either premium or economic. 
Derive two sub classes to represent the specific tickets such as 1) Premium 2) Economic. 
In addition to movie, people with premium tickets can opt for food delivery and game station entry. 
People with economic tickets can only avail food along with movie.  The cost of food is as follows, 
Food Combo 1 - Rs.800/-  Food combo 2 - Rs.500/- Food Combo 3 - Rs.300/-. The cost for game station 
entry is Rs.250/- Override the calcBill() method to read quantity, food combo for each ticket, 
calculate and display the bill amount.

Read the choice of the user for the type of ticket, create the respective object and 
call the method to print the bill amount. Use Dynamic Polymorphism to implement the solution.

Sample I/O:

1 – type
3 – number of tickets
1 – Food Combo
1 – Food Combo
3 – Food Combo
Bill Amount:Rs.3400

Sample I/O:

2
1
3
Bill Amount:Rs.550

(Hint: Read the value for type in main(), accordingly create child class object and call the calcBill(Scanner), 
read qty, food combo inside calcBill(Scanner). Send Scanner class object as argument to calcBill method. 
Create Parent class reference and point it to child class object for dynamic polymorphism.)
******************************************************************************/


import java.util.Scanner;

class Ticket{
    public int quantity;
    public int price;
    Ticket(){
        price = 250;
    }
    public void calcBill(Scanner sc){
        quantity = sc.nextInt();
        int food = 0;
        for (int i = 0; i < quantity; i++){
            int ch = sc.nextInt();
            if (ch == 1){
                food += 800;
            }
            else if (ch == 2){
                food += 500;
            }
            else{
                food += 300;
            }
        }
        System.out.println("Bill Amount:Rs." + (price*quantity + food));
    }
}
class Premium extends Ticket{
    Premium(){
        price = 500;
    }
    public void calcBill(Scanner sc){
        quantity = sc.nextInt();
        int food = 0;
        for (int i = 0; i < quantity; i++){
            int ch = sc.nextInt();
            if (ch == 1){
                food += 800;
            }
            else if (ch == 2){
                food += 500;
            }
            else{
                food += 300;
            }
        }
        System.out.println("Bill Amount:Rs." + (price*quantity + food));
    }
}
class Economic extends Ticket{
    Economic(){
        price = 250;
    }
    public void calcBill(Scanner sc){
        quantity = sc.nextInt();
        int food = 0;
        for (int i = 0; i < quantity; i++){
            int ch = sc.nextInt();
            if (ch == 1){
                food += 800;
            }
            else if (ch == 2){
                food += 500;
            }
            else{
                food += 300;
            }
        }
        System.out.println("Bill Amount:Rs." + (price*quantity + food));
    }
}


public class PAT7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1){
            Ticket t = new Premium();
            t.calcBill(sc);
        }
        else{
            Ticket t = new Economic();
            t.calcBill(sc);
        }
    }
}