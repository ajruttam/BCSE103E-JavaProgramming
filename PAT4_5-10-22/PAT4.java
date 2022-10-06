/*****************************************************************
Create the following class hierarchy and implement respective functions to pass the testcases.
1. abstract class GeometricObject with the following members
private class variables: color -String, filled-boolean
public methods: GeometricObject(), GeometricObject(String,boolean), String getColor(), void setColor(String), boolean isFilled(), void setFilled(boolean)
public abstract methods: double getArea(), double getPerimeter()
2. Inherit Circle class from GeometricObject abstract class with following members
private class variables: radius - double
public methods: Circle(), Circle(double), Circle(double,String,boolean), void setRadius(double), double getArea(), double getPerimeter(), void printCircle()
In the main method,
create Circle objects as specified - c1(), c2(2.0),c3(3.0,"Black",true)
Call the respective functions to pass the test cases.
(Use Math.PI for calculations)
*****************************************************************/

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

public class PAT4 {
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
    }
}
