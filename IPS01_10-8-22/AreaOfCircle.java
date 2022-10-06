/**********************************************************************
Area of Circle

Read the radius as double value and calculate the area of Circle using Java.

Sample Input
5

Sample Output
78.5
**********************************************************************/

import java.util.Scanner;

class AreaOfCircle{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
