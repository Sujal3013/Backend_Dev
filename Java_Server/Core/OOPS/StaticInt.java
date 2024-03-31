package OOPS;

public class StaticInt {
    static int a=4;
    static int b;
    // these a and b variables can be initialized using a static block
    // will only run once when first object is created
    static{
        System.err.println("I am a static block");
        // initializing b
        b=a*5;
    }
    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.err.println(StaticInt.a +" "+ StaticInt.b);
        StaticInt.b+=3; // b=23
        StaticInt obj2= new StaticInt();
        System.err.println(StaticInt.a +" "+ StaticInt.b);
    }
}
