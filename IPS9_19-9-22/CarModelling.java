/***********************************************************************************
Car Modelling
Class: Car
Private Data Fields: Colour, Name, Manufacturer, Mileage, Yearmodel
Public Methods: default constructor, readCar(), setCar(String, String, String,double,int), printCar()
Create the following objects:
object C1, call readCar() and printCar() functions
object C2, call setCar() with the values(Black,i10,Hyundai,20.36,2012) and printCar() functions.
Object C3 and call printCar() function.
***********************************************************************************/

import java.util.Scanner;

class Car{
    private String Colour, Name, Manufacturer;
    private double Mileage; 
    private int Yearmodel;
    Car(){
        Colour = Name = "*";
        Manufacturer = "* ";
        Mileage = 0;
        Yearmodel = 0;
    }
    public void readCar(){
        Scanner sc = new Scanner(System.in);
        Colour = sc.next();
        Name = sc.next();
        Manufacturer = sc.next();
        Mileage = sc.nextDouble();
        Yearmodel = sc.nextInt();
    }
    public void setCar(String c, String n, String m, double mil, int ym){
        Colour = c;
        Name = n;
        Manufacturer = m;
        Mileage = mil;
        Yearmodel = ym;
    }
    public void printCar(){
        System.out.println("Colour: " + Colour);
        System.out.println("Name: "+ Name);
        System.out.println("Manufacturer: "+Manufacturer);
        System.out.println("Mileage: " + Mileage);
        System.out.println("Yearmodel: "+Yearmodel);
    }
}

public class CarModelling{
    public static void main(String [] args){
        Car c1 = new Car();
        c1.readCar();
        c1.printCar();
        Car c2 = new Car();
        c2.setCar("Black","i10","Hyundai",20.36,2012);
        c2.printCar();
        Car c3 = new Car();
        c3.printCar();
    }
}