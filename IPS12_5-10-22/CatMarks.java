/***********************************************************************************
CAT Marks Generation

Define a class to store student's register number, name, and an integer array to store five subject's marks.
Define methods to read, print the student's details. Read method must throw "InvalidMarksException", 
if the marks are less than 0 orgreater than 30.
************************************************************************************/

import java.util.*;

class InvalidMarksException extends Exception{
    public InvalidMarksException(){
        super("Invalid Marks - Marks must be within the range 0 to 30");
    }
}

class Student{
    int regno;
    String name;
    int marks [] = new int[5];
    
    Student(){
        name = "*";
        regno = 0;
    }
    
    public void readData(Scanner sc) throws InvalidMarksException{
        regno = sc.nextInt();
        name = sc.next();
        try{
            for (int i = 0; i < 5; i++){
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 30)
                    throw new InvalidMarksException();
            }
        }
        catch (InvalidMarksException ex){
            System.out.println(ex);
        }
    }
    
    public void printData(){
        System.out.println("Regno:" + regno);
        System.out.println("Name:" + name);
        for (int i = 1; i <= 5; i++)
            System.out.println("Mark"+ i +":"+ marks[i-1]);
    }
}

public class CatMarks{
    public static void main(String [] args) throws InvalidMarksException{
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.readData(sc);
        s.printData();
    }
}