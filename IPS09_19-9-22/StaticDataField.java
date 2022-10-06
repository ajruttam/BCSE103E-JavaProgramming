/***********************************************************************************
Static Data Field
Class: Box
Private Data Fields: Length, Breadth, Height
Static Data Field: Box_Count
Constructors: Box() - Assign default values to data members and increment the Box_Count.
Public Methods: readData() - to read values for object, calcVolume() - to calculate and display the volume of cuboid box
Static Method: display() - to display the Box_Count value.
Objects:
B1, B2, B3 - Call the readData() and calcVolume() for each object and finally call display().
***********************************************************************************/

import java.util.Scanner;

class Box{
    private int length, breadth, height;
    static int Box_Count=0;
    Box(){
        length = 0;
        breadth = 0;
        height = 0;
        Box_Count++;
    }
    public void readData(Scanner sc){
        if(sc.hasNextInt()){
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        }
    }
    public void calcVolume(){
        int Volume = length * breadth * height;
        System.out.println("Volume = "+Volume);
    }
    static void display(){
        System.out.println("Number of Boxes: "+Box_Count);
    }
}

public class StaticDataField{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Box B1 = new Box();
        B1.readData(sc);
        B1.calcVolume();
        Box B2 = new Box();
        B2.readData(sc);
        B2.calcVolume();
        Box B3 = new Box();
        B3.readData(sc);
        B3.calcVolume();
        B3.display();
    }
}