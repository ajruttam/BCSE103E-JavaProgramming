/**********************************************************
Multi level Inheritance - Java
Design a class hierarchy as shown below. Your program should print the given expected output.
Vehicle (Regno,Region, ReadVehicle(), printVehicle())
FourWheeler (Type, ReadData(), printData())
Car (Name, Manufacturer, readCar(),printCar())
FourWheeler class must be derived fromVehicle class and Car class must be derived from FourWheeler class
Define the data members in private section, member functions in public section. Define the main() to create objects and call relevantfunctions.
Expected Output:
Constructor in Super Class of all
Constructor in Four Wheeler class
Constructor in Car Class
Regno: TN1234
Region: TamilNadu
Type: Luxury
Name: Fortuner
Manufacturer: Toyota
**********************************************************/

import java.util.Scanner;

class fromVehicle{
    private String Regno,Region;
    fromVehicle(){
        System.out.println("Constructor in Super Class of all");
    }
    
    public void ReadVehicle(Scanner sc){
        Regno = sc.next();
        Region = sc.next();
    }
    
    public void printVehicle(){
        System.out.println("Regno: " + Regno);
        System.out.println("Region: " + Region);
    }
}

class FourWheeler extends fromVehicle{
    private String Type;
    FourWheeler(){
        System.out.println("Constructor in Four Wheeler class");
    }
    public void ReadData(Scanner sc){
        Type = sc.next();
    }
    public void printData(){
        System.out.println("Type: " + Type);
    }
}

class Car extends FourWheeler{
    private String Name, Manufacturer;
    Car(){
        System.out.println("Constructor in Car Class");
    }
    public void readCar(Scanner sc){
        this.ReadVehicle(sc);
        this.ReadData(sc);
        Name = sc.next();
        Manufacturer = sc.next();
    }
    public void printCar(){
        this.printVehicle();
        this.printData();
        System.out.println("Name: "+ Name);
        System.out.println("Manufacturer: "+ Manufacturer);
    }
}

public class MultiLevelInheritance{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.readCar(sc);
        c1.printCar();
        sc.close();
    }
}