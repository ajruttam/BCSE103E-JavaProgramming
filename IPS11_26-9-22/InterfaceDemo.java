/**********************************************************
Interface Demo
Create an Interface named Shape with common properties like
color -String, border-int, void fillColor() , void drawBorder(), void calcArea()
The colour of all shapes is Black and Border thickness of all shapes is 2.
Create the following classes which implements the Shape Interface. Include additional methods /constructors in the class to read the required parameters.
Circle
Square
Cylinder - Additionally calculate Volume also.
*************************************************************/

import java.util.Scanner;

interface Shape{
    String color = "Black";
    int border = 2;
    public void fillColor();
    public void drawBorder(); 
    public void calcArea();
}

class Circle implements Shape{
    public int r;
    public double area;
    Circle(){
        r = 0;
    }
    public void fillColor(){
        System.out.println("Colour of Circle is " + color);
    }
    public void drawBorder(){
        System.out.println("Border of Circle is " + border);
    } 
    public void calcArea(){
        area = 3.14 * r * r;
    }
    public void getdata(Scanner sc){
        r = sc.nextInt();
    }
    public void putdata(){
        System.out.println("radius = "+ r);
        System.out.println("Area = " + area);
    }
}

class Square implements Shape{
    public int s;
    public int area;
    Square(){
        s = 0;
    }
    public void fillColor(){
        System.out.println("Colour of Square is " + color);
    }
    public void drawBorder(){
        System.out.println("Border of Square is " + border);
    } 
    public void calcArea(){
        area = s * s;
    }
    public void getdata(Scanner sc){
        s = sc.nextInt();
    }
    public void putdata(){
        System.out.println("Side = "+ s);
        System.out.println("Area = " + area);
    }
}

class Cylinder implements Shape{
    public int r;
    public int h;
    public double area, vol;
    Cylinder(){
        r = 0;
        h = 0;
    }
    public void fillColor(){
        System.out.println("Colour of Cylinder is " + color);
    }
    public void drawBorder(){
        System.out.println("Border of Cylinder is " + border);
    } 
    public void calcArea(){
        area = 2 * 3.14 * r * (h + r);
    }
    public void getdata(Scanner sc){
        r = sc.nextInt();
        h = sc.nextInt();
    }
    public void calcVolume(){
        vol = 3.14 * r * r * h;
    }
    public void putdata(){
        System.out.println("radius = "+ r);
        System.out.println("height = "+ h);
        System.out.println("Total Surface Area of Cylinder = " + area);
        System.out.println("Volume of Cylinder = " + vol);
    }
}

public class InterfaceDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.fillColor();
        c.drawBorder();
        c.getdata(sc);
        c.calcArea();
        c.putdata();
        Square s1 = new Square();
        s1.fillColor();
        s1.drawBorder();
        s1.getdata(sc);
        s1.calcArea();
        s1.putdata();
        Cylinder cy = new Cylinder();
        cy.fillColor();
        cy.drawBorder();
        cy.getdata(sc);
        cy.calcArea();
        cy.calcVolume();
        cy.putdata();
    }
}