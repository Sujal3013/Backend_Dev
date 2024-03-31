package OOPS.access;

public class Subclass extends A {
    Subclass(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(45,"Sujal");
        // protected accessible here
        String n= obj.name;
    }
}
