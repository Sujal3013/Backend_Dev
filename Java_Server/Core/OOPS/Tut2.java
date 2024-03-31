// Packages : works as compartment for classes,usually considered as folders
package OOPS;
import OOPS.Intro;

public class Tut2 {
     public static void main(String[] args) {
        System.out.println(A.objcount);
        A obj=new A("Sujal");
        System.out.println(obj);
        Intro.message();
        Intro obj1=new Intro();
     }
}
class A{
    final int num=10;
    // static variable can be accessed without instances of class.
    static long objcount;
    String name;
    public A(String name){
        this.name=name;
        A.objcount+=1; // static variable are called for classes. 
    }
}
