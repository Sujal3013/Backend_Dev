package OOPS.abstractdemo;

public abstract class Parent {
    int age;
    Parent(){
        
    }
    //  Abstract Constructor not allowed
        // abstract Parent(int age){

    // }
    abstract void career(String name);
    abstract void partner(String name,int age);
}
