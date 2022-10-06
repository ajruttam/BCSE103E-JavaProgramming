/***********************************************************************************
Classes and Objects
Create a class called Point with following specifications:
Private Integer Data fields: X and Y
Constructors: Default constructor and Parameterized constructor with two arguments
Public methods: 1) readData() - to read values for X and Y from user 2) printData() - to print X and Y values 3) addData() - to sum up X andY and display the sum
Objects: 1) Create Obj1 with no arguments, read values from user, print values and sum. 2) Create obj2 with arguments 35 and 70, printvalues and sum.
***********************************************************************************/

import java.util.Scanner;

class Point{
    private int x, y;
    Point(){
        x = 0;
        y = 0;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void readData(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public void printData(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public void addData(){
        System.out.println("Sum="+(x + y));
    }
}

public class ClassesObjects{
    public static void main(String [] args){
       Point obj1 = new Point();
       obj1.readData();
       obj1.printData();
       obj1.addData();
       Point obj2 = new Point(35,70);
       obj2.printData();
       obj2.addData();
    }
}