// Packages : works as compartment for classes,usually considered as folders
package OOPS;
import OOPS.Intro;

public class Tut2 {
     public static void main(String[] args) {
        A obj=new A("Sujal");
        System.out.println(obj);
        Intro.message();
        Intro obj1=new Intro();
     }
}
class A{
    final int num=10;
    static long objcount;
    String name;
    public A(String name){
        this.name=name;
        A.objcount+=1;
    }
}
