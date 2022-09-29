/**********************************************************
Dynamic Polymorphism
Create three classes Person, Professor and Student. The class Person should have data members name and age. Theclasses
Professor and Student should inherit from the class Person. 
The class Professor should have two integer members: publications and Empid. There will be two instance methods:
getdata and putdata.The function getdata should get the input from the user: the name, age and publications of the professor. The function
putdata should print the name, age, publications and the Empid of the professor. 
The class Student should have two data fields: marks, which is an array of size 3 and studID. It has two instancemethods:
getdata and putdata. The function getdata should get the input from the user: the name, age, and the marks
of the student in 3subjects. The function putdata should print the name, age, sum of the marks and the studID of the student.
For each object being created of the Professor or the Student class, sequential id's should be assigned to them starting from 1.
Solve this problem using dynamic polymorphism, constructors and static variables. Create two objects each for both Professor Class andStudent Class.
Sample Input:
Walter 50 98
Jessie 25 15
White 18 89 96 96
Pinkman 19 54 52 45
Sample Output:
Walter 50 98 ID:1
Jessie 25 15 ID:2
White 18 89 96 96 ID:1
Pinkman 19 54 52 45 ID:2
*************************************************************/

import java.util.Scanner;

class Person{
    public String name;
    public int age;
    Person(){
        name = "*";
        age = 0;
    }
    public void getdata(Scanner sc){
        name = sc.next(); 
        age = sc.nextInt();
    }
    public void putdata(){
        System.out.println(name + " " + age);
    }
}

class Professor extends Person{
    public int publications;
    static int Empid = 0;
    Professor(){
        publications = 0;
        Empid++;
    }
    public void getdata(Scanner sc){
        name = sc.next();
        age = sc.nextInt();
        publications = sc.nextInt();
    }
    public void putdata(){
        System.out.println(name + " " + age + " " + publications + " ID:" + Empid);
    }
}

class Student extends Person{
    int [] m = new int[3];
    static int studID = 0;
    Student(){
        studID++;
    }
    public void getdata(Scanner sc){
        name = sc.next();
        age = sc.nextInt();
        for (int i = 0; i < 3; i++)
            m[i] = sc.nextInt();
    }
    public void putdata(){
        System.out.println(name + " " + age + " " + m[0] + " " + m[1] + " " + m[2] + " ID:" + studID);
    }
}

public class DynamicPolymorphism{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Person p1 = new Professor();
        p1.getdata(sc); 
        p1.putdata();
        Person p2 = new Professor();
        p2.getdata(sc); 
        p2.putdata();
        Person s1 = new Student();
        s1.getdata(sc); 
        s1.putdata();
        Person s2 = new Student();
        s2.getdata(sc);
        s2.putdata();
    }
}