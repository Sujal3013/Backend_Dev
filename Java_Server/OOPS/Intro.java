package OOPS;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // Class : it is a named group of property and functions
        Student[] students=new Student[5];
        Student student1; //declaration
        student1=new Student(); //Initialization
        System.out.println(Arrays.toString(students)); //pointing to null

        Student student2= new Student(); //dynamically allocates memory and returns reference to it.
        //  "new" does dynamic memory allocation

        int a=10;
        // Wrapper Classes (Primitive as Object)
        Integer num=45;

        // final keyword : constant and always initialize and declare simultaneously
        // when a non primitive is final ,you can't reassign it.
        final int INCREASE=2;
    }
    public static void message(){
        System.out.println("This is package application");
    }

}

// create class
class Student {
    int rollno;
    String name;
    float marks;
    //Constructor Overloading
    Student(){
        // this.rollno=1;
        // this.name="Sujal";
        // this.marks=100;

        // Constructor from constructor calling
        // internally: new Student(1,"Test",90.0f);
        this(1,"Test",90.0f);
    }
    
    // Parameterized Constructor
    Student(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    Student(Student other){
        this.rollno=other.rollno;
        this.name=other.name;
        this.marks=other.marks;
    }
    
}

// Class : Logical Construct
// Object : Physical reality
