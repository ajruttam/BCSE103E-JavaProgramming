/***********************************************************************************
Inheritence - Geometric Object

Create the following class hierarchy and implement respective functions to pass the testcases.
1. Class GeometricObject with the following members
private class variables: color -String, filled-boolean
public methods: GeometricObject(), GeometricObject(String,boolean), String getColor(), void setColor(String), boolean isFilled(), voidsetFilled(boolean)

2. Inherit Circle class from GeometricObject with following members
private class variables: radius - double
public methods: Circle(), Circle(double), Circle(double,String,boolean), void setRadius(double), double getArea(), double getPerimeter(), voidprintCircle()

3. Inherit Rectangle class from GeometricObject with following members
private class variables: width, height - double
public methods: Rectangle(), Rectangle(double,double), Rectangle(doubl-e,double,String,boolean), void setData(double,double), doublegetArea(), double getPerimeter(), void printRectangle()

In the main method,
create Circle objects as specified - c1(), c2(2.0),c3(3.0,"Black",true)
Create Rectangle objects as specified - r1(), r2(5,10), r3(10,15,"Red",true)

Call the respective functions to pass the test cases.
(Use Math.PI for calculations, Area of Circle = Math.PI*R*R, Perimeter of Circle=2*Math.PI*R, Area of Rectangle = width*height, Perimeter ofRectangle=2*(width+height))
************************************************************************************/

import java.util.Scanner;
import java.lang.Math;

abstract class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "White";
        filled = false;
    }

    public GeometricObject(String s, boolean b) {
        color = s;
        filled = b;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String s) {
        color = s;
    }

    public void setFilled(boolean b) {
        filled = b;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends GeometricObject {
    private double radius;
    static int co = 0;

    public Circle() {
        radius = 1.0;
        co++;
    }

    public Circle(double d) {
        radius = d;
        co++;
    }

    public Circle(double d, String s, boolean f) {
        super(s, f);
        radius = d;
        co++;
    }

    public void setRadius(double d) {
        radius = d;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.println("Circle Object " + co);
        System.out.println("Radius:" + radius);
        System.out.println("Area:" + this.getArea());
        System.out.println("Perimeter:" + this.getPerimeter());
        System.out.println("Color:" + this.getColor());
        System.out.println("Filled:" + this.isFilled());
    }
}
class Rectangle extends GeometricObject {
    private double width;
    private double height;
    static int cr = 0;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
        cr++;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
        cr++;
    }

    public Rectangle(double w, double h, String s, boolean f) {
        super(s, f);
        width = w; 
        height = h;
        cr++;
    }

    public void setData(double w,double h) {
        width = w; 
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void printRectangle() {
        System.out.println("Rectangle Object " + cr);
        System.out.println("Width:" + width);
        System.out.println("Height:" + height);
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Color:" + getColor());
        System.out.println("Filled:" + isFilled());
    }
}

public class Inheritance{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        double r = sc.nextDouble();
        c1.setRadius(r);
        c1.printCircle();
        Circle c2 = new Circle(2.0);
        c2.printCircle();
        Circle c3 = new Circle(3.0, "Black", true);
        c3.printCircle();
        Rectangle r1 = new Rectangle();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        r1.setData(w,h);
        r1.printRectangle();
        Rectangle r2 = new Rectangle(5,10);
        r2.printRectangle();
        Rectangle r3 = new Rectangle(10,15,"Red",true);
        r3.printRectangle();
    }
}