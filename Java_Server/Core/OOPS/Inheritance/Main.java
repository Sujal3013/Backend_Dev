package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+box.w+" "+box.h);
        box.greeting();
        Boxweight box2=new Boxweight();
        System.out.println(box2.l+" "+box2.w+" "+box2.h+" "+box2.weight);
        // Static method can't be overridden
        box2.greeting();

        // // It is type of reference variable (Box) and not the type of object variable (Boxweight) that determines the properties that can be accessed.
        // Box box1=new Boxweight();
        // System.out.println(box1.w);

        // // there are many variables in both parent and child classes
        // // you are given access to variables that are in the ref type i.e. Boxweight,hence you should have access to weight variable
        // // this also means that variables you are trying to access should be initialized (weight variable)
        // // Boxweight box3=new Box(); NOT ALLOWED

        // Boxprice box4=new Boxprice(4,5,6);


    }
}
