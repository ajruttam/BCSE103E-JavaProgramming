/**********************************************************
Inheritance
Create a class called Employee with the attributes Eno, Ename, Designation and Salary. Include constructors, member functions to read anddisplay the values for attributes. Inherit a class called Manager from Employee class in public mode with the attributes totalemp,totalsupervisors. Include constructors, member functions to read and display the values for attributes of the Manager class. Create anobject for the child class and call all the member functions to read and print the details of an employee who is a Manager.
Sample Output:
Eno: 100
Ename: ABCDEF
Designation: Manager
Salary: 80000
Total employees in the dept: 150
Total supervisors in the dept: 15
**********************************************************/

import java.util.Scanner;

class Employee{
    public String Ename, Designation;
    public int Eno;
    public int Salary;
    Employee(){
        Eno = 0;
        Ename = Designation = "*";
        Salary = 0;
    }
    void readE(Scanner sc){
        Eno = sc.nextInt();
        Ename = sc.next();
        Designation = sc.next();
        Salary = sc.nextInt();
    }
    void printE(){
        System.out.println("Eno: " + Eno);
        System.out.println("Ename: "+ Ename);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}

class Manager extends Employee{
    public int totalemp, totalsupervisors;
    Manager(){
        totalemp = totalsupervisors = 0;
    }
    void readM(Scanner sc){
        readE(sc);
        totalemp = sc.nextInt();
        totalsupervisors = sc.nextInt();
    }
    void printM(){
        printE();
        System.out.println("Total employees in the dept: " + totalemp);
        System.out.println("Total supervisors in the dept: " + totalsupervisors);
    }
}

public class Inheritance{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Manager m = new Manager();
        m.readM(s);
        m.printM();
        s.close();
    }
}