/***********************************************************************************
Employee Class
Class name: Employee
Private Memers: Eno,Ename,Age,BasicSalary, checkAge() - To check whether the age is in the range 22 to 58, if it is beyond 58, make it 58. Ifit is less than 22, make it 22.
Public Members: default constructor-initialize with default values, readData() - read user data, printData()-display the basic employeedetails also check the age limit, calcPayroll() - Function to calculate and display HRA, DA, PF,Gross,Netsal (HRA-10% of basic, DA-30% ofbasic, PF-5% of basic, Gross is sum of basic,HRA,and DA, Netsal is subtracting PF from Gross.)
Create an object in main function and call the member functions.
***********************************************************************************/

import java.util.Scanner;


public class EmployeeMain{
    public static void main(String [] args){
        Employee E1 = new Employee();
        E1.readData();
        E1.calcPayroll();
        E1.printData();
    }
}

class Employee{
    
    private int Eno, age, BasicSalary;
    private String Ename;
    private void checkAge(){
        if (age > 58)
            age = 58;
        else if (age < 22)
            age = 22;
    }
    
    Employee(){
        Eno = 0;
        Ename = "";
        age = 0;
        BasicSalary = 0;
    }
    
    public void readData(){
        Scanner sc = new Scanner(System.in);
        Eno = sc.nextInt();
        Ename = sc.next();
        age = sc.nextInt();
        BasicSalary = sc.nextInt();
    }
    double HRA, DA, PF, Gross, Netsal;
    public void calcPayroll(){
        HRA = 0.1 * BasicSalary;
        DA = 0.3 * BasicSalary;
        PF = 0.05 * BasicSalary;
        Gross = BasicSalary + HRA + DA;
        Netsal = Gross - PF;
    }
    
    public void printData(){
        System.out.println("Emp No: "+Eno);
        System.out.println("Emp Name: "+Ename);
        this.checkAge();
        System.out.println("Emp Age: "+age);
        System.out.println("Basic Salary: "+BasicSalary);
        System.out.println("HRA: "+(int)HRA);
        System.out.println("DA: "+(int)DA);
        System.out.println("PF: "+(int)PF);
        System.out.println("Gross Salary: "+(int)Gross);
        System.out.println("Net Salary: "+(int)Netsal);
    }
    
}